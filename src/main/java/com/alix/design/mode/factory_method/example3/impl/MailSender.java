package com.alix.design.mode.factory_method.example3.impl;

import com.alix.design.mode.factory_method.example3.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender");
    }
}
