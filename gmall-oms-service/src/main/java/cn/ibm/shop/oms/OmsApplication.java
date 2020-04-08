package cn.ibm.shop.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.ibm.shop.oms.mapper")
@EnableFeignClients
public class OmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(OmsApplication.class,args);
    }
}
