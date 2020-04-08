package cn.ibm.shop.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.ibm.shop.pms.mapper")
public class PmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(PmsApplication.class,args);
    }
}
