package cn.sc.czy.web.service;

import cn.sc.czy.api.EchoApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("travel-service")
public interface EchoService extends EchoApi {
}