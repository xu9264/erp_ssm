package com.erp.service;

import com.erp.pojo.Goods;
import com.erp.pojo.GoodsExample;
import com.erp.util.EasyUiResultUtil;

import java.util.List;

public interface GoodsService {
    /**
     *
     * @param example
     * @return
     */
    List<Goods> selectByExample(GoodsExample example);

    EasyUiResultUtil<Goods> page(Goods wheres,int pageNum, int pageSize);

    void add(Goods goods);

    Goods findById(Integer id);

    void update(Goods goods);

    void remove(int[] ids);
}
