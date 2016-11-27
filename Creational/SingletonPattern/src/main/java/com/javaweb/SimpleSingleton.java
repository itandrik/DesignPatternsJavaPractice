package com.javaweb;

/**
 * Simple singleton
 * <p>
 * + Ленивая инициализация
 * - Низкая производительность (критическая секция) в наиболее
 *   типичном доступеая секция) в наиболее типичном доступесть
 *
 * @author Andrii Chernysh
 * @version 1.0 27 Nov 2016
 */
public final class SimpleSingleton {
    private static SimpleSingleton instance = null;

    private SimpleSingleton() {
    }

    public static synchronized SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
