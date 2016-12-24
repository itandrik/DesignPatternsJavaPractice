package com.javaweb;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple example of "Observer" pattern
 *
 * @author Andrii Chernysh on 16-Dec-16. E-Mail : itcherry97@gmail.com
 */
public class ObserverPatternMain {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();
        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.setMeasurements(25,760);
        meteoStation.setMeasurements(-5,745);
    }
}

interface Observed {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}

interface Observer {
    void handleEvent(int temperature, int pressure);
}

class MeteoStation implements Observed {
    private int temperature;
    private int pressure;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.handleEvent(temperature,pressure);
        }
    }

    public void setMeasurements(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObserver();
    }
}
class ConsoleObserver implements Observer{

    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Weather changed; Temperature : "
                + temperature + "; pressure : " + pressure);
    }
}
class FileObserver implements Observer{

    @Override
    public void handleEvent(int temperature, int pressure) {
        try {
            File f = File.createTempFile("TempPressure","_txt");
            PrintWriter writer = new PrintWriter(f);
            writer.write("Weather changed; Temperature : "
                    + temperature + "; pressure : " + pressure);
            writer.println();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}