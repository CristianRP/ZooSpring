package com.umg.zoo.repository;

import com.umg.zoo.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cristian Ramírez on 9/11/2017.
 * UMG
 * cristianramirezgt@gmail.com
 */
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
