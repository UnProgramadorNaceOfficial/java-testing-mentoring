package org.example.service;

import org.example.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    List<User> findUsersByDepartment(Long departmentId);
}
