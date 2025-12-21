// src/test/java/com/example/demo/DrugInteractionCheckerTest.java
package com.example.demo;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestResultListener.class)
public class DrugInteractionCheckerTest {

    @Mock
    private Object dependency;

    @InjectMocks
    private Object service;

    @BeforeMethod
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSample() {
    }
}
