package org.nicholas.mappers;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.nicholas.models.User;

import java.util.List;

public interface UserMapper {
    @Select("select * from user left join blog.blog b on user.blog_id = b.blog_id;")
    @Results({
            @Result(property = "userId", column = "user_id", id = true),
            @Result(property = "emailId", column = "email_id"),
            @Result(property = "password", column = "password"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastname", column = "lastname"),
            @Result(property = "blog", column = "blog_id", one = @One(select = "org.nicholas.mappers.BlogMapper.findById"))
    })
    public List<User> findAll();

    @Select("select * from user left join blog.blog b on user.blog_id = b.blog_id where user.user_id = #{userId};")
    @Results({
            @Result(property = "userId", column = "user_id", id = true),
            @Result(property = "emailId", column = "email_id"),
            @Result(property = "password", column = "password"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastname", column = "lastname"),
            @Result(property = "blog", column = "blog_id", one = @One(select = "org.nicholas.mappers.BlogMapper.findById"))
    })
    public User findById(int id);
}
