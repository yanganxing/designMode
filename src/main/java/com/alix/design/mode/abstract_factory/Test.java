package com.alix.design.mode.abstract_factory;

public class Test {
    public static void main(String[] args) {
        Provider provider = new MailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
