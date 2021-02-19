package com.kaesar.design_patterns.zen.chp12;

public class GamePlayerProxy12_15 implements IGamePlayer12_13 {
    private IGamePlayer12_13 gamePlayer = null;

    public GamePlayerProxy12_15(IGamePlayer12_13 _gamePlayer) {
        this.gamePlayer = _gamePlayer;
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

    @Override
    public IGamePlayer12_13 getProxy() {
        return this;
    }
}
