package com.javaweb;


import java.util.ArrayList;
import java.util.List;

public class MediatorMain {
    public static void main(String[] args) {
        TextChat chat = new TextChat();
        User admin = new Admin(chat, "Petya Poroshenko");
        User user1 = new SimpleUser(chat,"Vitalya boxing");
        User user2 = new SimpleUser(chat,"Yuliia");
        User user3 = new SimpleUser(chat,"Vitya");

        user2.setEnable(false);
        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.sendMessage("Not everybody can look on tomorrow...");
        System.out.println();
        admin.sendMessage("I gonna sell my sweet factory!!!");
    }
}

abstract class User {
    Chat chat;
    String name;
    boolean isEnable = true;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public String getName() {
        return name;
    }

    void sendMessage(String msg) {
        chat.sendMessage(msg, this);
    }

    abstract void getMessage(String msg);
}

interface Chat {
    void sendMessage(String msg, User user);
}

class Admin extends User {
    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("Admin " + getName() + " received message : " + msg);
    }
}

class SimpleUser extends User {

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("User " + getName() + " received message : " + msg);
    }
}

class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && (admin instanceof Admin)) {
            this.admin = admin;
        } else {
            throw new RuntimeException(admin.getName() + " + don't have permissions");
        }
    }

    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("No admin in the chat!");
        }
        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Admin can't enter to another chat");
        }
    }

    @Override
    public void sendMessage(String msg, User user) {
        if (user instanceof Admin) {
            for (User u : users) {
                u.getMessage(u.getName() + " : " + msg);
            }
        } else if (user instanceof SimpleUser) {
            for (User u : users) {
                if (u != user && u.isEnable) {
                    u.getMessage(u.getName() + " : " + msg);
                }
            }
            if (admin.isEnable) {
                admin.getMessage(admin.getName() + " : " + msg);
            }
        }
    }
}
