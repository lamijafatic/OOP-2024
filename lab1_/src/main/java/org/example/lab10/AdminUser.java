package org.example.lab10;
import org.example.lab10.UserPermission;

@UserPermission("ADMIN")
public class AdminUser extends User {
    public AdminUser(String username){
        super(username);
    }
}
