package cn.ibm.shop.pms.controller;


import cn.ibm.common.pojo.Brand;
import cn.ibm.shop.pms.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 品牌 前端控制器
 * </p>
 *
 * @author GKF
 * @since 2020-04-07
 */
@RestController
@RequestMapping("/pms")
public class BrandController {

    @Autowired
    private IBrandService brandService;

    @GetMapping("/list")
    public List<Brand> getList(){
        return brandService.list();
    }

}
