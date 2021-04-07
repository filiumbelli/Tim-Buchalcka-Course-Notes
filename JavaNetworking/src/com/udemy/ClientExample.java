package com.udemy;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;

public class ClientExample {

    private static final ServerSocketExample server = new ServerSocketExample();
    private static Socket socket = null;
    public ClientExample() {
        try {
            socket = server.getServer().accept();
            Logger.getGlobal().warning("Client is connected");
        }catch(IOException e){
            e.printStackTrace();

        }
    }

    public Socket getClient(){
        return socket;
    }

}
