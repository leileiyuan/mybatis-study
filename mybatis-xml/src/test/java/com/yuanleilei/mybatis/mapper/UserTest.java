package com.yuanleilei.mybatis.mapper;

import com.yuanleilei.mybatis.model.SysUser;
import com.yuanleilei.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class UserTest {
    private SqlSession sqlSession;

    @Test
    public void findById() {
        sqlSession = MybatisUtil.getSqlSession();
        Integer id = 1;
        try {
            //SysUser user = sqlSession.selectOne("findById", id);
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = mapper.findById(id);

            sqlSession.commit();
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }

    }

    @Test
    public void saveTest() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = new SysUser();
            user.setCreateTime(new Date());
            user.setUserName("用户2");
            user.setUserInfo("用户2");
            user.setUserEmail("user2@mybatis.cn");
            user.setUserPassword("88888888");

            long id = mapper.save(user);
            sqlSession.commit();

            Assert.assertEquals(1, id);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }
    }
}
