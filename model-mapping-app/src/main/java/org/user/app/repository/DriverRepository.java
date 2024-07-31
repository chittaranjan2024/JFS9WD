package org.user.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.user.app.entities.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>{

}
