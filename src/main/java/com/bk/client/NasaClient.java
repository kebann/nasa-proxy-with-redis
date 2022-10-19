package com.bk.client;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "nasa-client", url = "${nasa.api.url}:${nasa.api.port}")
public interface NasaClient {

    @GetMapping("/mars/pictures/largest")
    @Cacheable("mars-pictures")
    byte[] findLargestPicture(@RequestParam Integer sol, @RequestParam(required = false) String camera);
}
