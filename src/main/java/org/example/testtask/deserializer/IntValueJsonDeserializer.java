/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;
import java.io.IOException;
import org.example.testtask.dto.IntValueDto;
import org.springframework.boot.jackson.JsonComponent;

/**
 * IntValueJsonDeserializer.
 *
 * @since 1.0
 */
@JsonComponent
public final class IntValueJsonDeserializer extends JsonDeserializer<IntValueDto> {

    /**
     * JSON value property.
     */
    public static final String VALUE_PROP = "intValue";

    @Override
    public IntValueDto deserialize(final JsonParser parser, final DeserializationContext ctx)
        throws JsonProcessingException, IOException {
        final TreeNode node = parser.getCodec().readTree(parser);
        final IntValueDto result;
        if (node.get(IntValueJsonDeserializer.VALUE_PROP) instanceof IntNode) {
            final IntNode val = (IntNode) node.get(IntValueJsonDeserializer.VALUE_PROP);
            result = new IntValueDto(val.intValue());
        } else {
            result = new IntValueDto(null);
        }
        return result;
    }
}
