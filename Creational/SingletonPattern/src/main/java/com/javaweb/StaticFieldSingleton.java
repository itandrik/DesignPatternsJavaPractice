package com.javaweb;

/**
 * Static field singleton
 * <p>
 * + Простая и прозрачная реализация
 * + Потокобезопасность
 * - Не ленивая инициализация
 *
 * @author Andrii Chernysh
 * @version 1.0 27 Nov 2016
 */
public class StaticFieldSingleton {
    public static final StaticFieldSingleton INSTANCE = new StaticFieldSingleton();
}
