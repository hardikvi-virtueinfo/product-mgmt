package com.ahha.connector;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-mgmt")
public interface ContentData {

    @GetMapping( "api/user")
    String getUser();

}
