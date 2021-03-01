package com.kaesar.designpattern.zen;

public class WhiteHumanFactory extends AbstractHumanFactory8_15 {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
