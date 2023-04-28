package cn.sc.czy.service.controller;

import cn.sc.czy.api.EchoApi;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EchoController implements EchoApi {

    @Value("${echo.pre-echo}")
    private String preEcho;

    @Override
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return preEcho + message;
    }

    @RabbitListener(queuesToDeclare = @Queue("echo"))
    public void rabbitmq(String message) {
        System.err.println(message);
    }

}
