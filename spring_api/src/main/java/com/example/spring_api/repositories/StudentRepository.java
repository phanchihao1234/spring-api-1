package com.example.spring_api.repositories;

import com.example.spring_api.models.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    // Custom JPQL query
//    @Query("SELECT s FROM Student s WHERE s.ten = ?2 ")
//    List<Student> findByNameAndCity(String ten);
    List<Student> findByTenContainsIgnoreCase(String ten);
    /// select s from student -> s la` *
    @Query(" SELECT s from Student s where s.thanhPho like lower(concat('%',:name,'%')) ")
    List<Student> findByThanhPho(String name);
    @Query(" SELECT s from Student s where s.thanhPho like lower(concat('%',:name,'%')) or s.ten like lower(concat('%',:name,'%')) ")
    List<Student> findByThanhPhoAndTen(String name);

    Page<Student> findAll(Pageable pageable);
}
