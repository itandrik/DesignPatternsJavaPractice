package com.javaweb.commands;

import com.javaweb.ElectronicDevice;

public class TurnTvDown implements Command {
    ElectronicDevice device;

    public TurnTvDown(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
