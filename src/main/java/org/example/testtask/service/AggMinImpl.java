/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.service;

import java.util.List;
import org.example.testtask.repository.IntValueAggRepository;

/**
 * The type Agg min.
 *
 * @since 1.0
 */
public final class AggMinImpl extends AbstractIntValueAggService {

    /**
     * Instantiates a new Agg min.
     *
     * @param repository The int value repository
     */
    public AggMinImpl(final IntValueAggRepository repository) {
        super(repository);
    }

    @Override
    public Float aggAll() {
        return this.getRepository().aggMinAll();
    }

    @Override
    public Float aggByIdList(final List<Long> ids) {
        return this.getRepository().aggMinByIdList(ids);
    }
}
