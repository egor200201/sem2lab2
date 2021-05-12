package com.company;

public interface MessageListener {
    void messageReceived(User senderName, String message);
}