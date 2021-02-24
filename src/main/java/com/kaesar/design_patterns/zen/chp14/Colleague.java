package com.kaesar.design_patterns.zen.chp14;

public abstract class Colleague {
    protected MediatorCommon mediatorCommon;

    public Colleague(MediatorCommon _mediatorCommon) {
        this.mediatorCommon = _mediatorCommon;
    }
}
