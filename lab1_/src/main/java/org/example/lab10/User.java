package org.example.lab10;

public abstract class User {
    protected String username;

    public User (String username){
        this.username=username;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
