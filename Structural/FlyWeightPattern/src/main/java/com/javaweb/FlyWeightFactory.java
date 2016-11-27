package com.javaweb;

import java.util.HashMap;
import java.util.Map;

/**
 * The FlyweightFactory class is our flyweight factory.
 * It utilizes the singleton pattern so that we only
 * have once instance of the factory, which we obtain via
 * its static getInstance() method. The FlyweightFactory
 * creates a hashmap pool of flyweights. If a request is
 * made for a flyweight object and that object doesn't exist,
 * it is created and placed in the flyweight pool.
 * The flyweight pool of the FlyweightFactory stores all the
 * instances of the different types of flyweights
 * (ie, FlyweightAdder object, FlyweightMultiplier object, etc).
 * Thus, only one instance of each type is created,
 * and this occurs on-demand.
 *
 * @author Andrii Chernysh
 * @version 1.0 , 27 Nov 2016
 */
public class FlyWeightFactory {
    private static FlyWeightFactory instance = null;

    private Map<String,FlyWeight> flyWeightPool;
    public FlyWeightFactory(){
        flyWeightPool = new HashMap<>();
    }

    public static FlyWeightFactory getInstance(){
        if(instance == null){
            instance = new FlyWeightFactory();
        }
        return instance;
    }
    public FlyWeight getFlyWeight(String key){
        if(flyWeightPool.containsKey(key)){
            return flyWeightPool.get(key);
        } else {
            FlyWeight flyweight;
            if ("add".equals(key)) {
                flyweight = new FlyWeightAdder();
            } else {
                flyweight = new FlyWeightMultiplier();
            }
            flyWeightPool.put(key, flyweight);
            return flyweight;
        }
    }
}
