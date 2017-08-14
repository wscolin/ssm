package com.colin.crud.test;

import com.colin.crud.bean.Deptment;
import com.colin.crud.bean.Employee;
import com.colin.crud.dao.DeptmentMapper;
import com.colin.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * Created by colin on 2017/8/13.
 * spring 单元测试
 */
//用SpringJUnit4ClassRunner测试
@RunWith(SpringJUnit4ClassRunner.class)
//获取spring配置文件的
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    DeptmentMapper deptmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SqlSession  sqlSession;
    @Test
    public void testCRUD() {
        deptmentMapper.insertSelective(new Deptment(null,"开发部"));
        deptmentMapper.insertSelective(new Deptment(null,"测试部"));
        deptmentMapper.insertSelective(new Deptment(null,"财务部"));
        employeeMapper.insert(new Employee(null,"陈国飞","M","mrcolin@126.com",1));
         EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for(int i = 0; i < 1000;i++){
            String name = UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Employee(null,name,"M",name+"@126.com",1));
        }
    }

    /*public static void main(String[] args) {
        ApplicationContext a =  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(a);
    }*/
}
