package com.noonhope.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author onlystatic
 * @date 2020-11-07 06:31 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderPaymentMain9001.class, args);
    }
}
