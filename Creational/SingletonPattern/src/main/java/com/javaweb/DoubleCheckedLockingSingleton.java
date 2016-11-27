package com.javaweb;

/**
 * Double-checked lock singleton
 * <p>
 * + Ленивая инициализация
 * + Высокая производительность
 * - Поддерживается только с JDK 1.5 [5]
 *
 * @author Andrii Chernysh
 * @version 1.0 27 Nov 2016
 */
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance = null;

    private DoubleCheckedLockingSingleton() {
    }

    public static synchronized DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
