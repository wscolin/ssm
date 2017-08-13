package com.colin.crud.test;

import com.colin.crud.dao.DeptmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by colin on 2017/8/13.
 * spring 单元测试
 */
//用SpringJUnit4ClassRunner测试
//@RunWith(SpringJUnit4ClassRunner.class)
//获取spring配置文件的
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
   /* @Autowired
    DeptmentMapper deptmentMapper;
    @Test
    public void testCRUD() {
        System.out.println(deptmentMapper);
    }*/

    public static void main(String[] args) {
        ApplicationContext a =  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(a);
    }
}
