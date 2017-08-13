package com.colin.crud.dao;

import com.colin.crud.bean.Deptment;
import com.colin.crud.bean.DeptmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptmentMapper {
    long countByExample(DeptmentExample example);

    int deleteByExample(DeptmentExample example);

    int insert(Deptment record);

    int insertSelective(Deptment record);

    List<Deptment> selectByExample(DeptmentExample example);

    int updateByExampleSelective(@Param("record") Deptment record, @Param("example") DeptmentExample example);

    int updateByExample(@Param("record") Deptment record, @Param("example") DeptmentExample example);
}