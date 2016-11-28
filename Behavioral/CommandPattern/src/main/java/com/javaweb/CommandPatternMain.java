package com.javaweb;

import com.javaweb.commands.*;

import java.util.Arrays;
import java.util.List;

/**
 * Example of design pattern "Command"
 *
 * @author Andrii Chernysh
 */
public class CommandPatternMain {
    public static void main(String[] args) {
        ElectronicDevice device = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(device);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnTVOff offCommand = new TurnTVOff(device);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        TurnTVUp upCommand = new TurnTVUp(device);
        onPressed = new DeviceButton(upCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        TurnTvDown downCommand = new TurnTvDown(device);
        onPressed = new DeviceButton(downCommand);
        onPressed.press();

        //----------------------------------------------
        Television tv = new Television();
        Radio radio = new Radio();

        List<ElectronicDevice> devices = Arrays.asList(tv, radio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(devices);
        DeviceButton turnThemOffBtn = new DeviceButton(turnOffDevices);
        turnThemOffBtn.press();

        turnThemOffBtn.pressUndo();
    }
}
