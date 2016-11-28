package com.javaweb;

import com.javaweb.commands.Command;


public class DeviceButton {
    Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}
