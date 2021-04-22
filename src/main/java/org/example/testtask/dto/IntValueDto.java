/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * IntValueDto.
 *
 * @since 1.0
 */
public final class IntValueDto {

    /**
     * Value.
     */
    @NotNull
    @Min(Integer.MIN_VALUE)
    @Max(Integer.MAX_VALUE)
    private final Integer value;

    /**
     * Constructor.
     *
     * @param val Value
     */
    public IntValueDto(final Integer val) {
        this.value = val;
    }

    /**
     * Gets int value.
     *
     * @return Integer int value
     */
    public Integer getValue() {
        return this.value;
    }
}
