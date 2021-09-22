package com.socket.ex;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class GreetClientTest {
    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        GreetClient client = new GreetClient();
        client.StartClient("127.0.0.1", 1919);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }
}