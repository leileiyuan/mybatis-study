package com.yuanleilei.mybatis.mapper;

import com.yuanleilei.mybatis.model.SysUser;
import com.yuanleilei.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {
    private SqlSession sqlSession;

    @Test
    public void findById() {
        sqlSession = MybatisUtil.getSqlSession();
        Integer id = 1;
        try {
            SysUser user = sqlSession.selectOne("findById", id);

            sqlSession.commit();
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }
}
