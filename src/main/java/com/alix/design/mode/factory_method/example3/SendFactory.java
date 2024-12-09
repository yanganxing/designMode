package com.alix.design.mode.factory_method.example3;

import com.alix.design.mode.factory_method.example3.impl.MailSender;
import com.alix.design.mode.factory_method.example3.impl.SmsSender;

public class SendFactory {

    public static Sender produceSms() {
        return new SmsSender();
    }

    public static Sender produceMail() {
        return new MailSender();
    }
}
