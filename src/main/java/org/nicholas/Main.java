package org.nicholas;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.nicholas.mappers.BlogMapper;
import org.nicholas.mappers.PostMapper;
import org.nicholas.mappers.UserMapper;

import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
//        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sessionFactory.openSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//
//        mapper.findAll().forEach(System.out::println);
//        System.out.println();
//
//        System.out.println(mapper.findById(1));
//
//        session.commit();
//        session.close();

        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        PostMapper postMapper = sqlSession.getMapper(PostMapper.class);
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        postMapper.findAll().forEach(System.out::println);
        blogMapper.findAll().forEach(System.out::println);
        userMapper.findAll().forEach(System.out::println);
//        System.out.println(mapper.findById(1));
//        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
//
//        mapper.findAll().forEach(System.out::println);
//
//        System.out.println("\n" + mapper.findById(1));
    }
}