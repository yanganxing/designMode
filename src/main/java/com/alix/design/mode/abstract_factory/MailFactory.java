package com.alix.design.mode.abstract_factory;

import com.alix.design.mode.abstract_factory.impl.MailSender;

public class MailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
