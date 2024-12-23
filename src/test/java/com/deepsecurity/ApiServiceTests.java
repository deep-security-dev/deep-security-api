package com.deepsecurity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiServiceTests {

    @Test
    public void testSayHello() {
        // Test the output of the sayHello() method in the ApiService
        ApiService apiService = new ApiService();
        String expectedResponse = "Hello from the Deep Security API!";
        String actualResponse = apiService.sayHello();

        assertEquals(expectedResponse, actualResponse, "The API response should match the expected message.");
    }
}
