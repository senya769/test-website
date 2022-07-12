package com.Website.repository;

import com.Website.model.User;

import java.sql.SQLException;

public interface BaseDAO {
    User findByLoginAndPassword(String log, String pas) throws SQLException;
    boolean createUser(User user);
}
