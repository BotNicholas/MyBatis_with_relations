package org.nicholas.mappers;

import org.nicholas.models.User;

import java.util.List;

public interface UserMapper {
    public List<User> findAll();
    public User findById(int id);
}
