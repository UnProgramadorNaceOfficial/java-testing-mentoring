package org.example.repository;

import org.example.entity.Department;
import org.example.entity.User;

import java.util.List;

public class DepartmentRepository {

    List<Department> departmentList = List.of(
            new Department(
                    1L,
                    "New York",
                    List.of(
                            new User(1L, "John", "Doe"),
                            new User(2L, "Jane", "Smith"),
                            new User(3L, "Alice", "Johnson"))
            ),

            new Department(
                    2L,
                    "Los Angeles",
                    List.of(
                            new User(4L, "Bob", "Williams"),
                            new User(5L, "Charlie", "Brown"),
                            new User(6L, "Diana", "Prince"))
            ),

            new Department(
                    3L,
                    "Chicago",
                    List.of(
                            new User(7L, "Eve", "Black"),
                            new User(8L, "Frank", "White"),
                            new User(9L, "Grace", "Green"))
            )
    );

    public List<User> findUsersByDepartment(Long id) {

        System.out.println(" -> Buscando usuarios en el servicio real");

        return this.departmentList
                .stream()
                .filter( department -> department.getId() == id )
                .findFirst()
                .orElseThrow()
                .getUserList();
    }
}
