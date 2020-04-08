package cn.ibm.shop.oms.feign;

import cn.ibm.common.pojo.Brand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "gmall-pms-service")
public interface PmsFeignService {

    @GetMapping("/pms/list")
    public List<Brand> getList();
}
