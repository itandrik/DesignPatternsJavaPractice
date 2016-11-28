package com.javaweb.commands;

import com.javaweb.ElectronicDevice;


public class TurnTVOn implements Command {
    ElectronicDevice device;

    public TurnTVOn(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
