package cn.itcast.core.service.impl;

import cn.itcast.core.dao.good.BrandDao;
import cn.itcast.core.pojo.good.Brand;
import cn.itcast.core.service.BrandService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDao brandDao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Brand> findAll() {
        System.out.println("aaa+++++++++");
        System.out.println("aaa1+++++++++");
        return brandDao.selectByExample(null);
    }
}
