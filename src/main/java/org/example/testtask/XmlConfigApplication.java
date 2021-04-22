/*
 * Copyright (c) 2021
 * All rights reserved.
 */

package org.example.testtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * The type Xml config application.
 *
 * @since 1.0
 */
@SpringBootApplication
@ImportResource("classpath*:applicationContext.xml")
@SuppressWarnings({
    "PMD.ClassWithOnlyPrivateConstructorsShouldBeFinal",
    "PMD.UseUtilityClass"
})
public class XmlConfigApplication {

    /**
     * The entry point of application.
     *
     * @param args The input arguments
     */
    public static void main(final String... args) {
        SpringApplication.run(XmlConfigApplication.class, args);
    }
}
