package com.kaesar.designpattern.zen.chp12;

public class GamePlayerProxy12_11 implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    // 通过构造函数传递要对谁进行代练
    public GamePlayerProxy12_11(String name) {
        try {
            gamePlayer = new GamePlayer12_10(this, name);
        } catch (Exception e) {
            // TODO 异常处理
        }
    }

    // 代练登录
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    // 代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    // 代练升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
