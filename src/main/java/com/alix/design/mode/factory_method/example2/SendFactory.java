package com.alix.design.mode.factory_method.example2;

import com.alix.design.mode.factory_method.example2.impl.MailSender;
import com.alix.design.mode.factory_method.example2.impl.SmsSender;

public class SendFactory {

    public Sender produceSms() {
        return new SmsSender();
    }

    public Sender produceMail() {
        return new MailSender();
    }
}
