package cn.itcast;

import cn.itcast.core.dao.good.BrandDao;
import cn.itcast.core.pojo.good.Brand;
import cn.itcast.core.pojo.good.BrandQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-dao.xml"})
public class Mybatistest {

    @Autowired
    private BrandDao brandDao;

    @Test
    public void findAll(){
        List<Brand> brands = brandDao.selectByExample(null);
        System.out.println(brands);
    }
    @Test
    public void findById(){
        Brand brand = brandDao.selectByPrimaryKey(1L);
        System.out.println(brand);
    }

    @Test
    public void findBrandByExample(){

        BrandQuery brandQuery = new BrandQuery();
        //brandQuery.setFields("id,name");
        brandQuery.setOrderByClause("id desc");
        BrandQuery.Criteria criteria = brandQuery.createCriteria();
        criteria.andNameLike("%海%");


        List<Brand> brands = brandDao.selectByExample(brandQuery);
        System.out.println(brands);
    }
}
