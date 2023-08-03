package org.dao;

import org.apache.ibatis.session.SqlSession;
import org.dto.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
//继承SqlSessionDaoSupport(提供sqlSession)为了拿他的SqlSession属性
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

    public List<User> queryAll() {
        //获取SqlSessionFactory生成的sqlSession
        SqlSession session = super.getSqlSession();
        //读取相应的mapper文件
        IUserDao mapper = session.getMapper(IUserDao.class);
        return mapper.queryAll();
    }
}
