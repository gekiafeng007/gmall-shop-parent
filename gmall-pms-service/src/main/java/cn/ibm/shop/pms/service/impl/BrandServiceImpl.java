package cn.ibm.shop.pms.service.impl;

import cn.ibm.common.pojo.Brand;
import cn.ibm.shop.pms.mapper.BrandMapper;
import cn.ibm.shop.pms.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌 服务实现类
 * </p>
 *
 * @author GKF
 * @since 2020-04-07
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
