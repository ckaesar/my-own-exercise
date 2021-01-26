package com.kaesar.design_patterns.zen;

public class YellowHumanFactory extends AbstractHumanFactory8_15 {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
