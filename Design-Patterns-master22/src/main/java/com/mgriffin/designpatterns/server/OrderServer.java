package com.mgriffin.designpatterns.server;

import com.mgriffin.designpatterns.order.*;

import java.io.IOException;
import java.net.ServerSocket;

public class OrderServer {

    private static int PORT_NUMBER = 8080;
    private static OrderService orderService;

    public static void main(String[] args)  throws IOException {
        ServerSocket listener = new ServerSocket(PORT_NUMBER);
        System.out.println("Starting server...");
        OrderServiceFactory factory = new SingleMachineOrderServiceFactory();
        orderService = factory.createOrderService();

        try {
            while (true) {
                ClientConnection connection = new ClientConnectionImpl(listener, orderService);
                connection.open();
            }
        }
        finally {
            System.out.println("Fail");
            listener.close();
        }
    }

}