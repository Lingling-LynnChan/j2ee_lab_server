package cn.sc.czy.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface EchoApi {
    @GetMapping("/echo/{message}")
    String echo(@PathVariable String message);
}
