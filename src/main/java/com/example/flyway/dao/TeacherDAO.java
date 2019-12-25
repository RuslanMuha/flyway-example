package com.example.flyway.dao;

import com.example.flyway.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDAO extends JpaRepository<Teacher, String> {
}
