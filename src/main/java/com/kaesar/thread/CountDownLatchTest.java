package com.kaesar.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author chengkai
 */
@Slf4j
public class CountDownLatchTest {
    private static ExecutorService executorService = null;

    public static void main(String[] args) {
        CountDownLatchTest testPool = new CountDownLatchTest();
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            strList.add(i + "");
        }
        testPool.latchPoolProcess(strList);
    }

    static {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("JobService-pool-%d").build();
        executorService = new ThreadPoolExecutor(4, 8,
                30000L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(2048), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
    }

    public void latchPoolProcess(List<String> strList) {
        if (CollectionUtils.isEmpty(strList)) {
            return;
        }
        log.info("原有的list总数->{}", strList.size());
        try {
            CountDownLatch latch = new CountDownLatch(strList.size());
            for (String str : strList) {
                submit(str, latch);
            }
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            log.info("销毁线程池" + Thread.currentThread().getName());
            executorService.shutdown();
        }
    }

    public void submit(String record, CountDownLatch latch) {
        executorService.submit(() -> {
            try {
                System.out.println("当前线程--->" + Thread.currentThread().getName());
                System.out.println(record);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (latch != null) {
                    log.info("第{}批执行完成", latch.getCount());
                    latch.countDown();
                }
            }
        });
    }

    @PreDestroy
    public void destroy() {
        log.info("销毁线程池" + Thread.currentThread().getName());
        executorService.shutdown();
    }
}
