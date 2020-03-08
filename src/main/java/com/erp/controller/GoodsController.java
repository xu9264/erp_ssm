package com.erp.controller;

import com.erp.mapper.GoodsMapper;
import com.erp.pojo.Goods;
import com.erp.service.GoodsService;
import com.erp.util.EasyUiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("page")
    public EasyUiResultUtil<Goods> page(Goods wheres,
                                         @RequestParam(defaultValue = "1") int pageNum,
                                        @RequestParam(defaultValue = "2") int pageSize){
        return goodsService.page(wheres,pageNum,pageSize);
    }
    @RequestMapping("add")
    public  boolean  add(Goods goods){
        goodsService.add(goods);
        return true;
    }
    @RequestMapping("findById")
    public Goods findById(Integer id){

        return goodsService.findById(id);
    }
    @RequestMapping("remove")
    public  boolean remove(int[] ids){
        goodsService.remove(ids);
        return true;
    }
    @RequestMapping("update")
    public boolean update(Goods goods){
        goodsService.update(goods);
        return true;
    }


}
