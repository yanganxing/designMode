package com.alix.design.mode.factory_method.example1;

import com.alix.design.mode.factory_method.example1.impl.MailSender;
import com.alix.design.mode.factory_method.example1.impl.SmsSender;

public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
