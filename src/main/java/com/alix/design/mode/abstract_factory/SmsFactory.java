package com.alix.design.mode.abstract_factory;

import com.alix.design.mode.abstract_factory.impl.SmsSender;

public class SmsFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
