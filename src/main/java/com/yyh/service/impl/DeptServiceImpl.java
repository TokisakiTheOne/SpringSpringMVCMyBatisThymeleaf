package com.yyh.service.impl;

import com.yyh.dao.DeptDao;
import com.yyh.po.Dept;
import com.yyh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-21-10:57
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> selectAll() {
        return deptDao.selectAll();
    }

    @Override
    public int delete(int dept_id) {
        return deptDao.delete(dept_id);
    }

    @Override
    public Dept selectById(int dept_id) {
        return deptDao.selectById(dept_id);
    }

    @Override
    public int update(Dept dept) {
        return deptDao.update(dept);
    }

    @Override
    public int insert(Dept dept) {
        return deptDao.insert(dept);
    }
}
