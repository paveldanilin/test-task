/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.testtask.dto.IntValueDto;
import org.example.testtask.entity.IntValue;
import org.example.testtask.exception.UnknownAggFunctionException;
import org.example.testtask.repository.IntValueCrudRepository;

/**
 * The type Int value.
 *
 * @since 1.0
 */
public final class IntValueImpl implements IntValueService {

    /**
     * CRUD repository.
     */
    private final IntValueCrudRepository repository;

    /**
     * Agg services.
     */
    private Map<String, AbstractIntValueAggService> aggregators;

    /**
     * Instantiates a new Int value.
     *
     * @param repository The int value repository
     */
    public IntValueImpl(final IntValueCrudRepository repository) {
        this.repository = repository;
        this.aggregators = new HashMap<>();
    }

    /**
     * Sets agg services.
     *
     * @param aggs The agg services
     */
    public void setAggregators(final Map<String, AbstractIntValueAggService> aggs) {
        this.aggregators = aggs;
    }

    @Override
    public IntValue create(final IntValueDto dto) {
        final IntValue val = new IntValue();
        val.setValue(dto.getValue());
        return this.repository.save(val);
    }

    @Override
    public Float aggregate(final String fun, final List<Long> ids)
        throws UnknownAggFunctionException {
        if (this.aggregators.containsKey(fun)) {
            return this.aggregators.get(fun).aggregate(ids);
        }
        throw new UnknownAggFunctionException(fun);
    }
}
