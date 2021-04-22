/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.service;

import java.util.List;
import org.example.testtask.repository.IntValueAggRepository;

/**
 * The type Agg max.
 *
 * @since 1.0
 */
public final class AggMaxImpl extends AbstractIntValueAggService {

    /**
     * Instantiates a new Agg max.
     *
     * @param repository The int value repository
     */
    public AggMaxImpl(final IntValueAggRepository repository) {
        super(repository);
    }

    @Override
    public Float aggAll() {
        return this.getRepository().aggMaxAll();
    }

    @Override
    public Float aggByIdList(final List<Long> ids) {
        return this.getRepository().aggMaxByIdList(ids);
    }
}
