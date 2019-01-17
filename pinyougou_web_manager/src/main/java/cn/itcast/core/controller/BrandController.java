package cn.itcast.core.controller;

import cn.itcast.core.pojo.good.Brand;
import cn.itcast.core.service.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*@Controller
@ResponseBody*/

@RestController
@RequestMapping("brand")
public class BrandController {
    @Reference
    private BrandService brandService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }

}
