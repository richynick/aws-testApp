package com.richard.org.springbootmysqldocker.dao;

import com.richard.org.springbootmysqldocker.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student, Integer> {
}
