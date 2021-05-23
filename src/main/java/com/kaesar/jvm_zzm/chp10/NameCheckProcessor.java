package com.kaesar.jvm_zzm.chp10;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * 注解处理器NameCheckProcessor
 *
 * @Author: chengk
 * @Date: 2021/5/23 4:26 下午
 */
// 可以用"*"表示支持所有Annotations
@SupportedAnnotationTypes("*")
// 只支持JDK6的代码
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class NameCheckProcessor extends AbstractProcessor {
    private NameChecker nameCheck;

    /**
     * 初始化名称检查插件
     *
     * @param processingEnv
     */
    public void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        nameCheck = new NameChecker(processingEnv);
    }

    /**
     * 对输入的语法树的各个节点进行名称检查
     *
     * @param annotations
     * @param roundEnv
     * @return
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (!roundEnv.processingOver()) {
            for (Element element : roundEnv.getRootElements()) {
                nameCheck.checkNames(element);
            }
        }
        return false;
    }
}
