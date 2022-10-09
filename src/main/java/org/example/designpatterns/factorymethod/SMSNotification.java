package org.example.designpatterns.factorymethod;

public class SMSNotification implements Notification {
    public void notifyUser(){
        System.out.println("SMS notif");
    }
}
