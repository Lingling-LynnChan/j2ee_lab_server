package cn.sc.czy.web.controller;

import cn.sc.czy.web.service.EchoService;
import cn.sc.czy.web.service.RabbitmqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class EchoController {

    @Resource
    private EchoService echoService;

    @Autowired
    private RabbitmqService rabbitmqService;

    @ResponseBody
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return echoService.echo(message);
    }

    @ResponseBody
    @GetMapping("/rabbitmq/{message}")
    public String rabbitmq(@PathVariable String message) {
        rabbitmqService.send(message);
        return "OK";
    }

}
