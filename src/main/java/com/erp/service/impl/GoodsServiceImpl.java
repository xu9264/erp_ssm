package com.erp.service.impl;

import com.erp.mapper.GoodsMapper;
import com.erp.pojo.Goods;
import com.erp.pojo.GoodsExample;
import com.erp.service.GoodsService;
import com.erp.util.EasyUiResultUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> selectByExample(GoodsExample example) {
        return null;
    }


    @Override
    public EasyUiResultUtil<Goods> page(Goods wheres,int pageNum, int pageSize) {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        if (wheres.getName()!=null&&wheres.getName()!=""){
            criteria.andNameLike("%"+wheres.getName()+"%");
        }
        if (wheres.getOrigin()!=null&&wheres.getOrigin()!=""){
            criteria.andNameLike("%"+wheres.getOrigin()+"%");
        }
        if (wheres.getProducer()!=null&&wheres.getProducer()!=""){
            criteria.andNameLike("%"+wheres.getProducer()+"%");
        }
        int count = (int) goodsMapper.countByExample(example);
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goods = goodsMapper.selectByExample(example);

        return new EasyUiResultUtil<Goods>(count,goods);
    }

    @Override
    public void add(Goods goods) {
        goodsMapper.insert(goods);
    }

    @Override
    public Goods findById(Integer id) {

        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Goods goods) {
        System.out.println(goods.toString()+"哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
        goodsMapper.updateByPrimaryKey(goods);
    }

    @Override
    public void remove(int[] ids) {

        for (int i=0;i<ids.length;i++){
            goodsMapper.deleteByPrimaryKey(ids[i]);
        }


    }
}
