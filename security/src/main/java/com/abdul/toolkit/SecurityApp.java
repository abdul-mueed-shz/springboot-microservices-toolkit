package com.abdul.toolkit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Toolkit Security!
 */
@Configuration
@ComponentScan(basePackages = "com.abdul.toolkit.security") // Limit scanning to the security package
public class SecurityApp {

    // Add any shared beans or configurations if needed
}
