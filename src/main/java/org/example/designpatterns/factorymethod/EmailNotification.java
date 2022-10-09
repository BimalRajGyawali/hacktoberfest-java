package org.example.designpatterns.factorymethod;

public class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Email notif");
    }
}
