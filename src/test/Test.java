import com.yyh.dao.DeptDao;
import com.yyh.po.Dept;
import com.yyh.service.DeptService;
import org.apache.ibatis.annotations.ResultMap;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-21-11:03
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-*.xml"})*/
public class Test {
/*

    //  No qualifying bean of type   springmvc 注解失败
   */
/* @Autowired
    private DeptService deptService;*//*

@Resource
private DeptDao deptDao;
    @org.junit.Test
    public void test() {
       */
/* deptDao.selectAll().forEach(System.out::println);*//*

        List<Dept> depts = deptDao.selectAll();
        for (Dept dept : depts) {
            System.out.println("dept = " + dept);
        }
    }
*/

}
