package cn.ibm.shop.oms.controller;


import cn.ibm.common.entity.ResultBean;
import cn.ibm.common.pojo.Brand;
import cn.ibm.shop.oms.feign.PmsFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/oms")
public class BrandController {

    @Autowired
    private PmsFeignService pmsService;

    @GetMapping("/list")
    public ResultBean<List<Brand>> getList(){
        List<Brand> list = pmsService.getList();
        return ResultBean.ok(list,"查询品牌列表");
    };

}
