package org.example.service;

import org.example.DataProvider;
import org.example.entity.User;
import org.example.repository.DepartmentRepository;
import org.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private DepartmentRepository departmentRepository;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

//    @BeforeEach
//    public void init() {
//        MockitoAnnotations.openMocks(this);
//    }

//    @BeforeEach
//    public void init(){
//        this.departmentRepository = mock(DepartmentRepository.class);
//        this.userRepository = mock(UserRepository.class);
//        this.userService = new UserServiceImpl(userRepository, departmentRepository);
//    }

    @Test
    public void testFindAll() {
        // When
        when(userRepository.findAll()).thenReturn(DataProvider.userListMock());
        List<User> userList = userService.findAll();

        // Then
        assertNotNull(userList);
        assertFalse(userList.isEmpty());
        assertEquals(4, userList.size());
        assertEquals("John", userList.get(0).getName());
        assertEquals("Doe", userList.get(0).getLastName());
        assertEquals("Jane", userList.get(1).getName());
        assertEquals("Smith", userList.get(1).getLastName());
    }

    @Test
    public void testFindUsersByDepartment(){
        // When
        when(this.departmentRepository.findUsersByDepartment(1L)).thenReturn(DataProvider.userListMock());
        List<User> userList = this.departmentRepository.findUsersByDepartment(1L);

        // Then
        assertNotNull(userList);
        assertFalse(userList.isEmpty());
        assertEquals(4, userList.size());
        assertEquals("John", userList.get(0).getName());
        assertEquals("Doe", userList.get(0).getLastName());
        assertEquals("Jane", userList.get(1).getName());
        assertEquals("Smith", userList.get(1).getLastName());
    }
}
