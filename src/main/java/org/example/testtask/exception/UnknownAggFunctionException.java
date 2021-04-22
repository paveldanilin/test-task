/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.exception;

/**
 * The type Unknown agg function exception.
 *
 * @since 1.0
 */
public class UnknownAggFunctionException extends Exception {
    /**
     * The agg function name.
     */
    private final String func;

    /**
     * Instantiates a new Unknown agg function exception.
     *
     * @param func The func name
     */
    public UnknownAggFunctionException(final String func) {
        super("Unknown agg function");
        this.func = func;
    }

    /**
     * Gets func.
     *
     * @return The func name
     */
    public String getFunc() {
        return this.func;
    }
}
