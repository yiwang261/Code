package com.wang.Factory;

public class ClientService {
//    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {
        return new ClientService();
    }
}
