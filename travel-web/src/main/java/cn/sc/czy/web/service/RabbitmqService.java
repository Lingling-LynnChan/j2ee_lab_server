package cn.sc.czy.web.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqService {

    @Autowired
    private AmqpTemplate rabbitAmqpTemplate;

    public <T> void send(T obj) {
        rabbitAmqpTemplate.convertAndSend("echo", obj);
    }
}
