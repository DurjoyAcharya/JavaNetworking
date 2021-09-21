package com.socket.ex;

import java.io.*;
import java.net.ServerSocket;

public class ServerSecondProgram {
    private static String str1="";
    private static String str2="";
    public static void main(String[] args) throws IOException {
        var server=new ServerSocket(9021);
        var acceptServer=server.accept();
        System.out.println("Durjoy Connected: "+acceptServer.getInetAddress());
        var din=new DataInputStream(acceptServer.getInputStream());
        var dout=new DataOutputStream(acceptServer.getOutputStream());
        var br=new BufferedReader(new InputStreamReader(System.in));
        while (!str1.equals("Over"))
        {
            str1= din.readUTF();
            System.out.println("Durjoy Says: "+str1);
            str2= br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        dout.close();
        br.close();
        din.close();
    }
}
