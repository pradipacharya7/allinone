package com.allinone.practice.REST;


import com.allinone.practice.model.Student;
import com.allinone.practice.services.StudentService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentResourcesTest {
    @MockBean
    private StudentService studentService;

    @Autowired
    StudentResources studentResources;
    Student student1,student2;
    List<Student> students;
    @Before
    public void setUp() throws Exception {
        student1=new Student(1,"Pradip","pradip.acahry@gmail.com",1);
        student2=new Student(1,"Prasiddha","pradiddha.acahry@gmail.com",2);
        students=Arrays.asList(student1,student2);
    }

    @Test
    public  void showAll() throws Exception{
        Mockito.when(studentService.findAll()).thenReturn(Stream.of(student1,student2).collect(Collectors.toList()));
        Assertions.assertThat(2).isEqualTo(studentResources.showall().size());
    }
}