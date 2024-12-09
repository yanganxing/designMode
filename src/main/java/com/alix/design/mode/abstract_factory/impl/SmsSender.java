package com.alix.design.mode.abstract_factory.impl;

import com.alix.design.mode.abstract_factory.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
