package org.user.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.user.app.entities.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
