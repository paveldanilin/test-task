/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.service;

import java.util.List;
import org.example.testtask.repository.IntValueAggRepository;

/**
 * The type Agg sum.
 *
 * @since 1.0
 */
public final class AggSumImpl extends AbstractIntValueAggService {

    /**
     * Instantiates a new Agg sum.
     *
     * @param repository The int value repository
     */
    public AggSumImpl(final IntValueAggRepository repository) {
        super(repository);
    }

    @Override
    public Float aggAll() {
        return this.getRepository().aggSumAll();
    }

    @Override
    public Float aggByIdList(final List<Long> ids) {
        return this.getRepository().aggSumByIdList(ids);
    }
}
