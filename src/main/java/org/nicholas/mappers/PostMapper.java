package org.nicholas.mappers;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.nicholas.models.Post;

import java.util.List;

public interface PostMapper {
    @Select("select * from post p where p.post_id = #{id}")
    @Results({
            @Result(property = "postId", column = "post_id", id = true),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "createdOn", column = "created_on")
    })
    public Post getById(int id);

    @Select("select * from post")
    @Results({
            @Result(property = "postId", column = "post_id", id = true),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "createdOn", column = "created_on")
    })
    public List<Post> findAll();
}
