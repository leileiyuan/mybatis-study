package com.yuanleilei.mybatis.dao;

import com.yuanleilei.mybatis.model.Person;
import com.yuanleilei.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {

    SqlSession sqlSession;

    @Test
    public void insertPerson() {
        sqlSession = MybatisUtil.getSqlSession();
        //int id = 10000;
        String userName = "test";
        int age = 18;
        String mobilePhone = "18000000000";
        Person person = new Person();
        //person.setId(id);
        person.setAge(age);
        person.setUserName(userName);
        person.setMobilePhone(mobilePhone);
        try {
            sqlSession.insert("insertPerson", person);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }

    @Test
    public void queryById() {
        sqlSession = MybatisUtil.getSqlSession();
        int id = 10001;
        try {
            Person person = sqlSession.selectOne("queryById", id);

            sqlSession.commit();
            System.out.println(person.getUserName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }
}