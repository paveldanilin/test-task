/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type Int value.
 *
 * @since 1.0
 */
@Entity
@Table(name = "integer_values")
public class IntValue extends AbstractEntity {
    /**
     * The integer value.
     */
    private Integer value;

    /**
     * Sets value.
     *
     * @param val The value
     */
    public void setValue(final Integer val) {
        this.value = val;
    }

    /**
     * Gets value.
     *
     * @return The value
     */
    public Integer getValue() {
        return this.value;
    }
}
