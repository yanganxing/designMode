package com.alix.design.mode.factory_method.example3.test;

import com.alix.design.mode.factory_method.example3.SendFactory;
import com.alix.design.mode.factory_method.example3.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        Sender mailSender = SendFactory.produceMail();
        mailSender.send();
        Sender smsSender = SendFactory.produceSms();
        smsSender.send();
    }
}
