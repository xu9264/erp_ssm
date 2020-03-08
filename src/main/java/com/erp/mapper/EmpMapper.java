package com.erp.mapper;

import com.erp.pojo.Emp;
import com.erp.vo.EmpVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    void remove(@Param("ids") int[] ids);

    void update(@Param("emp")Emp emp);

    EmpVo findById(@Param("id") int id);
    void  add(@Param("emp") Emp emp);

    int count(@Param("wheres") EmpVo wheres);

    List<EmpVo> page(@Param("wheres") EmpVo wheres,
                     @Param("start") int start,
                     @Param("pageSize") int pageSize);
    int getKey();



    Emp login(@Param("username") String username,@Param("password") String password);

}
