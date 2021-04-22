/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * The type Abstract entity.
 *
 * @since 1.0
 */
@MappedSuperclass
@SuppressWarnings("PMD.AbstractClassWithoutAbstractMethod")
public abstract class AbstractEntity {
    /**
     * The Id.
     */
    private @Id @GeneratedValue Long id;

    /**
     * Gets id.
     *
     * @return The id
     */
    public Long getId() {
        return this.id;
    }
}
