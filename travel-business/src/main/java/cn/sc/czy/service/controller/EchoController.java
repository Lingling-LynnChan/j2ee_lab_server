package cn.sc.czy.service.controller;

import cn.sc.czy.api.EchoApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

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

    @Bean
    public Consumer<String> business() {
        return message -> {
            message = "收到: " + message;
            System.err.println(message);
        };
    }

}
