package com.yyh.service;

import com.yyh.po.Dept;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-21-10:56
 */
public interface DeptService {


    List<Dept> selectAll();

    int delete(int dept_id);

    Dept selectById(int dept_id);

    int update(Dept dept);

    int insert(Dept dept);
}
