package org.example.lab10;

import java.lang.reflect.Method;

public class MessagingSystem {
    @CanSendMessage
    @RequiresPermission("ADMIN")

    public void sendMessage(User user) {

        UserPermission permissionAnnotation = user.getClass().getAnnotation(UserPermission.class);


        if (permissionAnnotation != null) {
            String userPermission = permissionAnnotation.value();

            if ("ADMIN".equals(userPermission)) {
                System.out.println("Admin user " + user.getUsername() + " has sent a message.");
            } else {
                System.out.println("Regular user " + user.getUsername() + " is restricted.");
            }
        } else {
            System.out.println("No permission for " + user.getUsername());
        }
    }




}
