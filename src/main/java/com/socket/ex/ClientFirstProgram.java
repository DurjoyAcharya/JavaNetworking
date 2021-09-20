package com.socket.ex;


//TCP Connection

import java.io.*;
import java.net.Socket;

public class ClientFirstProgram {
    public static void main(String[] args) {
        try {
            var socket=new Socket("127.0.0.1",2252);
           // var reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
           // System.out.println(reader.readLine());
            var dout=new DataOutputStream(socket.getOutputStream());
            dout.writeUTF("Hello Mr. Server");
            dout.flush();
            dout.close();
            //reader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
