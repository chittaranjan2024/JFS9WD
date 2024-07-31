package org.user.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.user.app.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
