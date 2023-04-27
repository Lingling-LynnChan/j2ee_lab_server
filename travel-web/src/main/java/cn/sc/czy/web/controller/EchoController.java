package cn.sc.czy.web.controller;

import cn.sc.czy.web.service.EchoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class EchoController {

    @Resource
    private EchoService echoService;

    @ResponseBody
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return echoService.echo(message);
    }

}
