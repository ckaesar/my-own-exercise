package com.kaesar.designpattern.zen.chp24;

import java.util.HashMap;

public class Memento3 {
    // 接受HashMap作为状态
    private HashMap<String, Object> stateMap;

    // 接受一个对象，建立一个备份
    public Memento3(HashMap<String, Object> map) {
        this.stateMap = map;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
