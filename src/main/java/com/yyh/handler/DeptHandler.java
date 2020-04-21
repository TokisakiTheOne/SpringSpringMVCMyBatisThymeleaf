package com.yyh.handler;

import com.yyh.po.Dept;
import com.yyh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-21-11:22
 */
@Controller
public class DeptHandler {

    @Autowired
    private DeptService deptService;


    @RequestMapping("/selectAll")
    public String selectAll(Model model) {
        List<Dept> depts = deptService.selectAll();

        model.addAttribute("depts", depts);
        return "selectAll";
    }
    @RequestMapping("/selectById")
    public String selectById(int dept_id,Model model) {
        Dept dept = deptService.selectById(dept_id);
        model.addAttribute("dept", dept);
        return "update";
    }

    @RequestMapping("/toInsert")
    public String toInsert(){
        return "insert";
    }


    @RequestMapping("/delete")
    public String delete(int dept_id) {
        deptService.delete(dept_id);
        return "redirect:selectAll";
    }
    @RequestMapping("/update")
    public String update(Dept dept) {
        deptService.update(dept);
        return "redirect:selectAll";
    }
    @RequestMapping("/insert")
    public String insert(Dept dept) {
        deptService.insert(dept);
        return "redirect:selectAll";
    }
}
