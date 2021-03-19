package com.kaesar.designpattern.zen.chp26;

public class Lift2 implements ILift2 {
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    // 电梯门开启
    @Override
    public void open() {
        // 电梯门在什么状态下才能开启
        switch (this.state) {
            case OPENING_STATE: // 开门状态，什么都不做
                // do nothing
                break;
            case CLOSING_STATE: // 闭门状态，则可以开启
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE: // 正在运行，则不能开门，什么都不做
                // do nothing
                break;
            case STOPPING_STATE: // 停止状态，当然要开门了
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }

    // 电梯门关闭
    @Override
    public void close() {
        // 电梯门在什么状态下才能关闭
        switch (this.state) {
            case OPENING_STATE: // 可以关门，同时修改电梯状态
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE: // 电梯是关门状态，则什么都不做
                // do nothing
                break;
            case RUNNING_STATE: // 正在运行，门本来就是关闭的，也什么都不做
                // do nothing
                break;
            case STOPPING_STATE: // 停止状态，门也是关闭的，什么也不做
                // do nothing
                break;
        }
    }

    // 电梯开始运行起来
    @Override
    public void run() {
        // 电梯门在什么状态下才能运行
        switch (this.state) {
            case OPENING_STATE: // 开门状态，什么都不做
                // do nothing
                break;
            case CLOSING_STATE: // 闭门状态，则可以运行
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE: // 正在运行，什么都不做
                // do nothing
                break;
            case STOPPING_STATE: // 停止状态，可以运行
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }

    // 电梯停止
    @Override
    public void stop() {
        // 电梯门在什么状态下才能停止
        switch (this.state) {
            case OPENING_STATE: // 开门状态，要先停下来，什么都不做
                // do nothing
                break;
            case CLOSING_STATE: // 闭门状态，则可以停止
                this.stopWithoutLogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE: // 正在运行，可以停止
                this.stopWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case STOPPING_STATE: // 停止状态，什么都不做
                break;
        }
    }

    // 纯粹的电梯开门，不考虑任何条件
    public void openWithoutLogic() {
        System.out.println("电梯门开启...");
    }

    // 纯粹的电梯关门，不考虑实际的逻辑
    public void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }

    // 纯粹的运行，不考虑任何条件
    public void runWithoutLogic() {
        System.out.println("电梯门上下运行起来...");
    }

    // 纯粹的停止，不考虑任何条件
    public void stopWithoutLogic() {
        System.out.println("电梯停止了...");
    }
}
