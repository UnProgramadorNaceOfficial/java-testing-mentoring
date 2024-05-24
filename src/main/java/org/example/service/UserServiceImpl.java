package org.example.service;

import org.example.entity.User;
import org.example.repository.DepartmentRepository;
import org.example.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private DepartmentRepository departmentRepository;

    public UserServiceImpl(UserRepository userRepository, DepartmentRepository departmentRepository) {
        this.userRepository = userRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public List<User> findUsersByDepartment(Long departmentId) {
        return this.departmentRepository.findUsersByDepartment(departmentId);
    }
}
