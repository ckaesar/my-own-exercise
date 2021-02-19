package com.kaesar.design_patterns.zen.chp12;

public class GamePlayer12_10 implements IGamePlayer {
    private String name = "";

    // 构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer12_10(IGamePlayer _gamePlayer, String _name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能创建真实角色！");
        } else {
            this.name = _name;
        }
    }

    // 进游戏之前要登录，这是一个必要条件
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    // 打怪
    @Override
    public void killBoss() {
        System.out.println(this.name + "在杀怪！");
    }

    // 升级
    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
