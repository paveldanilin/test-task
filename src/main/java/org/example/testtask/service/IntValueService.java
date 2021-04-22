/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.service;

import java.util.List;
import org.example.testtask.dto.IntValueDto;
import org.example.testtask.entity.IntValue;
import org.example.testtask.exception.UnknownAggFunctionException;

/**
 * The interface Int value service.
 *
 * @since 1.0
 */
public interface IntValueService {
    /**
     * Create int value.
     *
     * @param dto The value dto
     * @return The int value
     */
    IntValue create(IntValueDto dto);

    /**
     * Aggregate float.
     *
     * @param fun The agg func
     * @param ids The id list
     * @return The float
     * @throws UnknownAggFunctionException The unknown agg function exception
     */
    Float aggregate(String fun, List<Long> ids) throws UnknownAggFunctionException;
}
