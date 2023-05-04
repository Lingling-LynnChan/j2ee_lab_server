package cn.sc.czy.web.service.impl;

import cn.sc.czy.web.service.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class MessageProviderImpl implements MessageProvider {

    @Autowired
    private StreamBridge streamBridge;

    @Override
    public void send(String msg) {
        streamBridge.send("business-out-0", MessageBuilder.withPayload(msg).build());
        System.err.println("已发送: " + msg);
    }
}
