package cn.sc.czy.web.controller;

import cn.sc.czy.web.service.EchoService;
import cn.sc.czy.web.service.MessageProvider;
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
    private MessageProvider messageProvider;

    @ResponseBody
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return echoService.echo(message);
    }

    @ResponseBody
    @GetMapping("/rabbitmq/{message}")
    public String rabbitmq(@PathVariable String message) {
        messageProvider.send(message);
        return "OK";
    }

}
