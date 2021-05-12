package com.company;


import java.net.SocketAddress;

/*Клоасс - тип данных "Пользователь" с функциями*/
public class User {

    private String name;
    private String addres;

    public User (String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public String getAddres() {
        return addres;
    }
   public User(String senderName, SocketAddress remoteSocketAddress) { }
    }
