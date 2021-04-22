/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.service;

import java.util.List;
import org.example.testtask.repository.IntValueAggRepository;

/**
 * The type Agg avg.
 *
 * @since 1.0
 */
public final class AggAvgImpl extends AbstractIntValueAggService {
    /**
     * Instantiates a new Agg avg.
     *
     * @param repository The int value repository
     */
    public AggAvgImpl(final IntValueAggRepository repository) {
        super(repository);
    }

    @Override
    public Float aggAll() {
        return this.getRepository().aggAvgAll();
    }

    @Override
    public Float aggByIdList(final List<Long> ids) {
        return this.getRepository().aggAvgByIdList(ids);
    }
}
