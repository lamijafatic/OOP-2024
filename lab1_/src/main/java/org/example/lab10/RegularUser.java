package org.example.lab10;
import org.example.lab10.UserPermission;

@UserPermission("REGULAR")
public class RegularUser extends User {
    public RegularUser(String username) {
        super(username);
    }
}
