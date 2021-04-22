/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.repository;

import org.example.testtask.entity.IntValue;
import org.springframework.data.repository.Repository;

/**
 * Value crud repository.
 *
 * @since 1.0
 */
public interface IntValueCrudRepository extends Repository<IntValue, Long> {
    /**
     * Saves new integer value.
     *
     * @param val New integer value.
     * @return IntValue int value
     */
    IntValue save(IntValue val);
}
