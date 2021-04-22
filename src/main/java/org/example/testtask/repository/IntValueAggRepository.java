/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.repository;

import java.util.List;
import org.example.testtask.entity.IntValue;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 * Aggregation repository.
 *
 * @since 1.0
 */
public interface IntValueAggRepository extends Repository<IntValue, Long> {

    /**
     * Returns sum for all values.
     *
     * @return Float float
     */
    @Query("SELECT SUM(v.value) FROM IntValue v")
    Float aggSumAll();

    /**
     * Returns sum for the id list.
     *
     * @param ids The list of identities.
     * @return Float float
     */
    @Query("SELECT SUM(v.value) FROM IntValue v WHERE v.id IN (?1)")
    Float aggSumByIdList(List<Long> ids);

    /**
     * Returns max.
     *
     * @return Float float
     */
    @Query("SELECT MAX(v.value) FROM IntValue v")
    Float aggMaxAll();

    /**
     * Returns max.
     *
     * @param ids The list of identities.
     * @return Float float
     */
    @Query("SELECT MAX(v.value) FROM IntValue v WHERE v.id IN (?1)")
    Float aggMaxByIdList(List<Long> ids);

    /**
     * Returns min.
     *
     * @return Float float
     */
    @Query("SELECT MIN(v.value) FROM IntValue v")
    Float aggMinAll();

    /**
     * Returns min.
     *
     * @param ids The list of identities.
     * @return Float float
     */
    @Query("SELECT MIN(v.value) FROM IntValue v WHERE v.id IN(?1)")
    Float aggMinByIdList(List<Long> ids);

    /**
     * Returns avg.
     *
     * @return Float float
     */
    @Query("SELECT AVG(v.value) FROM IntValue v")
    Float aggAvgAll();

    /**
     * Returns avg.
     *
     * @param ids The list of identities.
     * @return Float float
     */
    @Query("SELECT AVG(v.value) FROM IntValue v WHERE v.id IN (?1)")
    Float aggAvgByIdList(List<Long> ids);
}
