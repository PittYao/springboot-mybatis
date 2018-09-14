package com.service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.mybatis.MybatisApplication;
import com.mybatis.mybatis.domain.Teacher;
import com.mybatis.mybatis.service.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TeacherServiceTest {

    @Autowired
    private TeacherService teacherService;

    @Test
    public void test(){
        Teacher teacher = new Teacher();
        teacher.setName("55");
        teacherService.insert(teacher);
    }
    /* 测试分页插件*/
    @Test
    public void testPageHelper(){
        /* 使用前指定页码和每页条数PageHelper.startPage;后一句必须是查询语句才行 */
        Page<Teacher> data = PageHelper.startPage(1, 2);
        System.out.println(JSON.toJSONString(teacherService.findAll()));
        int i= 2;
        /* 把数据放入到pageinfo对象 会有各种属性 */
        PageInfo<Teacher> pageInfo = new PageInfo<>(data);
        System.out.println(pageInfo);
        //PageInfo{pageNum=1, pageSize=2, size=2, startRow=1, endRow=2, total=5, pages=3, list=Page{count=true, pageNum=1, pageSize=2, startRow=0, endRow=2, total=5, pages=3, reasonable=true, pageSizeZero=false}[Teacher(id=1, name=ee), Teacher(id=2, name=dd)], prePage=0, nextPage=2, isFirstPage=true, isLastPage=false, hasPreviousPage=false, hasNextPage=true, navigatePages=8, navigateFirstPage=1, navigateLastPage=3, navigatepageNums=[1, 2, 3]}

        /* 分页线程安全问题 推荐写法 */
        /*
        List<Country> list;
        if(param1 != null){
            PageHelper.startPage(1, 10);
            list = countryMapper.selectIf(param1);
        } else {
            list = new ArrayList<Country>();
        }
        */

    }
}
