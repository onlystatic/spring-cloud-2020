package com.noonhope.springcloud.service;

import com.noonhope.springcloud.entity.common.CommonResult;
import java.math.BigDecimal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author v_qianglong
 * @date 2020/11/12 11:17
 */

@FeignClient(value = "cloud-seata-account-service")
public interface IAccountService {

    /**
     * 创建
     *
     * @param userId
     * @param amount
     * @return
     */
    @GetMapping("/account")
    CommonResult<String> create(@RequestParam("user_id") Long userId, @RequestParam("amount") BigDecimal amount);
}
