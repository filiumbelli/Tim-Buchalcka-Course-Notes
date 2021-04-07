package com.udemy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args){
        ClientExample client = new ClientExample();
        Socket socket = client.getClient();
        System.out.println("Connection is established");
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String echoString = input.readLine();
                if (echoString.equals("exit")) {
                    break;
                }
                output.println("Server: " + echoString);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

