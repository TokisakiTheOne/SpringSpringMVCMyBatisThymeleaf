package com.yyh.dao;

import com.yyh.po.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-21-10:55
 */
public interface DeptDao {
    @Select("select * from dept")
    List<Dept> selectAll();

    @Select("select * from dept where dept_id=#{dept_id}")
    Dept selectById(int dept_id);


    @Delete("delete  from dept where dept_id=#{dept_id}")
    int delete(int dept_id);

    @Update("update dept set dept_name = #{dept_name} where dept_id=#{dept_id};")
    int update(Dept dept);

    @Insert("insert into dept (dept_name) values (#{dept_name});")
    int insert(Dept dept);


}
