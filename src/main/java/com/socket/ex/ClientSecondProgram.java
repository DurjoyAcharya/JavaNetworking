package com.socket.ex;

import java.io.*;
import java.net.Socket;

public class ClientSecondProgram {
    private static String str1="";
    private static String str2="";
    public static void main(String[] args) throws IOException {
        var server=new Socket("127.0.0.1",9021);
        var din=new DataInputStream(server.getInputStream());
        var dout=new DataOutputStream(server.getOutputStream());
        var br=new BufferedReader(new InputStreamReader(System.in));
        while (!str1.equals("Over"))
        {
            str1=br.readLine();
            dout.writeUTF(str1);
            dout.flush();
            str2= din.readUTF();
            System.out.println("Rupkotha Says: "+str2);
        }
        dout.close();
        server.close();
        br.close();
    }
}
