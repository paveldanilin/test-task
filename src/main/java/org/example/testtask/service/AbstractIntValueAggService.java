/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.service;

import org.example.testtask.repository.IntValueAggRepository;

/**
 * The type Abstract int value agg service.
 *
 * @since 1.0
 */
public abstract class AbstractIntValueAggService extends AbstractAggService {
    /**
     * The agg repository.
     */
    private final IntValueAggRepository repository;

    /**
     * Instantiates a new Abstract int value agg service.
     *
     * @param repository The int value repository
     */
    public AbstractIntValueAggService(final IntValueAggRepository repository) {
        this.repository = repository;
    }

    /**
     * Gets int value agg repository.
     *
     * @return The int value agg repository
     */
    protected IntValueAggRepository getRepository() {
        return this.repository;
    }
}
