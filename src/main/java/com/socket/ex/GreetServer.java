package com.socket.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetServer {
    private ServerSocket serverSocket;
    private Socket clientsocket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    public void startServer(int port)
    {
        try {
            serverSocket =new ServerSocket(port);
            clientsocket =serverSocket.accept();
            printWriter=new PrintWriter(clientsocket.getOutputStream(),true);
            bufferedReader=new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
            String greetings=bufferedReader.readLine();
            if ("hello server".equals(greetings))
            {
                printWriter.println("hello client");
            }else{
                printWriter.println("Unrecognized greetings");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void stop() throws IOException {
        printWriter.close();
        bufferedReader.close();
        clientsocket.close();
        serverSocket.close();
    }
    public static void main(String[] args) throws IOException {
        var server=new GreetServer();
        server.startServer(1919);
        server.stop();
    }
}
