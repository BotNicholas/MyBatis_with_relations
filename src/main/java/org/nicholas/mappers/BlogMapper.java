package org.nicholas.mappers;

import org.nicholas.models.Blog;

import java.util.List;

public interface BlogMapper {
    List<Blog> findAll();
    Blog findById(int id);
}
