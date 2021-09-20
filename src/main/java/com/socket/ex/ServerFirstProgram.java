package com.socket.ex;


import java.io.*;
import java.net.ServerSocket;

public class ServerFirstProgram {
    public static void main(String[] args) {
        try {
            var socket=new ServerSocket(2252);
            while (true)
            {
                var socObj=socket.accept();
                System.out.println("Connection Running On Port: "+socket.getLocalPort());
//                System.out.println(socObj.getInetAddress());
//                var ps=new PrintStream(socObj.getOutputStream());
//                for (int i = 0; i < 100; i++) {
//                    ps.print(i+" ");
//                }
                var dis=new DataInputStream(socObj.getInputStream());
                var str=dis.readUTF();
                System.out.println("Read: "+str);
                System.out.println("Done <3");
                socObj.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
