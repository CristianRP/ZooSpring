package com.umg.zoo.repository;

import com.umg.zoo.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cristian Ramírez on 9/11/2017.
 * UMG
 * cristianramirezgt@gmail.com
 */
public interface MealRepository extends JpaRepository<Meal, Long> {
}
