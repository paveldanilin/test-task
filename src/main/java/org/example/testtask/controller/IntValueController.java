/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.controller;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import org.example.testtask.dto.IntValueDto;
import org.example.testtask.dto.ResponseError;
import org.example.testtask.exception.UnknownAggFunctionException;
import org.example.testtask.service.IntValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Int value controller.
 *
 * @since 1.0
 */
@RestController
@Validated
public class IntValueController {

    /**
     * The value service.
     */
    @Autowired
    private IntValueService service;

    /**
     * Create string.
     *
     * @param dto The int value dto
     * @return The string
     */
    @PostMapping(value = "/api/v1/values", consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@Valid @RequestBody final IntValueDto dto) {
        return this.service.create(dto).getId().toString();
    }

    /**
     * Aggregate float.
     *
     * @param func The agg func
     * @param id The id
     * @return The float
     * @throws UnknownAggFunctionException The unknown agg function exception
     */
    @GetMapping("/api/v1/values/{func}")
    public Float aggregate(
        @PathVariable() @Pattern(regexp = "^(sum|avg|min|max)$") final String func,
        @RequestParam(required = false) final List<Long> id) throws UnknownAggFunctionException {
        return this.service.aggregate(func, id);
    }

    /**
     * Exception handler response error.
     *
     * @param exception The exception
     * @return The response error
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public static ResponseError exceptionHandler(final Exception exception) {
        return new ResponseError(exception);
    }
}
