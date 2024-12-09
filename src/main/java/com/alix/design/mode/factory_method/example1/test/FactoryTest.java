package com.alix.design.mode.factory_method.example1.test;

import com.alix.design.mode.factory_method.example1.SendFactory;
import com.alix.design.mode.factory_method.example1.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
        sender.send();
    }
}
