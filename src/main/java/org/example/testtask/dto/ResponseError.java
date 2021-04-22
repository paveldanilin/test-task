/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.dto;

/**
 * ResponseError.
 *
 * @since 1.0
 */
public final class ResponseError {
    /**
     * User message.
     */
    private final String usermessage;

    /**
     * Developer message.
     */
    private final String devmessage;

    /**
     * Creates DTO from an exception.
     *
     * @param exception Exception
     */
    public ResponseError(final Exception exception) {
        this.usermessage = exception.getMessage();
        this.devmessage = exception.toString();
    }

    /**
     * Returns user message.
     *
     * @return String user message
     */
    public String getUserMessage() {
        return this.usermessage;
    }

    /**
     * Returns developer message.
     *
     * @return String developer message
     */
    public String getDeveloperMessage() {
        return this.devmessage;
    }
}
