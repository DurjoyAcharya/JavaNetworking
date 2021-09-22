package com.socket.ex;

import java.io.*;
import java.net.Socket;

public class GreetClient {

    private Socket socket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;

    public void StartClient(String ip,int port) throws IOException {
        socket=new Socket(ip,port);
        printWriter=new PrintWriter(socket.getOutputStream(),true);
        bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
    public String sendMessage(String Msg) throws IOException {
        printWriter.println(Msg);
        String response=bufferedReader.readLine();
        return response;
    }
    public void closeClient() throws IOException {
        printWriter.close();
        bufferedReader.close();
        socket.close();
    }

}
