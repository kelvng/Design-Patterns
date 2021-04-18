package com.mgriffin.designpatterns.server;

import com.mgriffin.designpatterns.order.*;

import java.io.IOException;
import java.net.ServerSocket;

public class OrderServer {

    private static int PORT_NUMBER = 9090;

    public static void main(String[] args)  throws IOException {
        System.out.println("Attempting connection...");
        ServerSocket listener = new ServerSocket(PORT_NUMBER);

        OrderServiceFactory factory = new SingleMachineOrderServiceFactory();
        OrderService orderService = factory.createOrderService();

        try {
            ClientConnection connection = new ClientConnectionImpl(listener, orderService);
            connection.open();
        }
        finally {
            listener.close();
        }
    }

}