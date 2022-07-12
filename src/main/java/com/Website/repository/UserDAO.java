package com.Website.repository;

import com.Website.model.User;

public interface UserDAO extends BaseDAO{
    boolean setStatus(String status);
    boolean deleteUser(User user);
}
