package com.udemy;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Logger;

public class ServerSocketExample {
    private static ServerSocket server = null;

    public ServerSocketExample() {
        try {
            server = new ServerSocket(8000);
            Logger.getGlobal().warning("Server is alive");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ServerSocket getServer(){
        return server;
    }

}
