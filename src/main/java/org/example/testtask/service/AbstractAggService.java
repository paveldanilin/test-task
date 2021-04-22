/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.service;

import java.util.List;

/**
 * The type Abstract agg service.
 *
 * @since 1.0
 */
public abstract class AbstractAggService {

    /**
     * Aggregate float.
     *
     * @param ids The id list
     * @return The float
     */
    public Float aggregate(final List<Long> ids) {
        final Float result;
        if (ids == null || ids.isEmpty()) {
            result = this.aggAll();
        } else {
            result = this.aggByIdList(ids);
        }
        return result;
    }

    /**
     * Agg all float.
     *
     * @return The float
     */
    public abstract Float aggAll();

    /**
     * Agg by id list float.
     *
     * @param ids The id list
     * @return The float
     */
    public abstract Float aggByIdList(List<Long> ids);
}
