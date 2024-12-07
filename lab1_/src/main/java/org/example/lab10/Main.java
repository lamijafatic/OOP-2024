package org.example.lab10;

import java.lang.reflect.Method;



public class Main {

    public static void main(String[] args) {

        User regularUser = new RegularUser("User1");
        User adminUser = new AdminUser("User2");


        MessagingSystem messagingSystem = new MessagingSystem();

        try {
            Method sendMessageMethod = MessagingSystem.class.getMethod("sendMessage", User.class);

            if (sendMessageMethod.isAnnotationPresent(CanSendMessage.class)) {
                System.out.println("\nExecuting sendMessage for RegularUser:");
                messagingSystem.sendMessage(regularUser);

                System.out.println("\nExecuting sendMessage for AdminUser:");
                messagingSystem.sendMessage(adminUser);
            } else {
                System.out.println("sendMessage method is not authorized to send messages.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
