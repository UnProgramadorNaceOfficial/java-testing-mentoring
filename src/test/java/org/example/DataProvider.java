package org.example;

import org.example.entity.User;

import java.util.List;

public class DataProvider {

    public static List<User> userListMock(){
        return List.of(
                new User(1L, "John", "Doe"),
                new User(2L, "Jane", "Smith"),
                new User(3L, "Alice", "Johnson"),
                new User(4L, "Bob", "Williams")
        );
    }
}
