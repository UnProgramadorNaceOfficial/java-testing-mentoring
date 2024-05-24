package org.example.repository;

import org.example.entity.User;

import java.util.List;

public class UserRepository {

    public List<User> findAll() {
        System.out.println(" -> Conectando a base de datos real");

        return List.of(
                new User(1L, "John", "Doe"),
                new User(2L, "Jane", "Smith"),
                new User(3L, "Alice", "Johnson"),
                new User(4L, "Bob", "Williams")
        );
    }
}
