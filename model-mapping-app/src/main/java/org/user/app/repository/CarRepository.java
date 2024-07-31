package org.user.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.user.app.entities.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
