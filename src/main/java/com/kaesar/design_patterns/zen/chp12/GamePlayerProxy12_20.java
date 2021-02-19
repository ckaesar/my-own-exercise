package com.kaesar.design_patterns.zen.chp12;

public class GamePlayerProxy12_20 implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy12_20(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升级费用是：150元");
    }
}
