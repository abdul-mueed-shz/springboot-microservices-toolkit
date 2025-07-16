package com.abdul.toolkit;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Utils module
 */
@Configuration
@EnableFeignClients
@ComponentScan(basePackages = "com.abdul.toolkit.utils") // For service classes
public class UtilsApp {
    // Add any shared beans or configurations if needed
}
