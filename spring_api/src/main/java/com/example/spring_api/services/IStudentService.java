package com.example.spring_api.services;

import com.example.spring_api.dto.StudentDTO;
import com.example.spring_api.models.Student;
import com.example.spring_api.responses.StudentResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {

    Student getStudentByID(Long id);
    List<Student> getAllStudent();
    Student saveStudent(StudentDTO studentDTO);
    Student updateStudent(Long id,StudentDTO studentDTO);
    void deleteStudent(Long id);

    List<Student> findByName(String name);
    List<Student> findByThanhPho(String name);
    List<Student> findByThanhPhoVaTen(String name);
    Page<StudentResponse> getAllStudent(Pageable pageable);

//    Page<CategoryResponse> getAllCategory(PageRequest pageRequest);
}
