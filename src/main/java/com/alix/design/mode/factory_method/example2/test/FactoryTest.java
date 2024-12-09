package com.alix.design.mode.factory_method.example2.test;

import com.alix.design.mode.factory_method.example2.Sender;
import com.alix.design.mode.factory_method.example2.SendFactory;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
