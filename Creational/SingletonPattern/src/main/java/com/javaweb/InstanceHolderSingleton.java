package com.javaweb;

/**
 * Instance holder singleton
 * <p>
 * + Ленивая инициализация
 * + Высокая производительность
 * - Невозможно использовать для не статических полей классаобки
 *   EnumSet, EnumMap и т.д.
 *
 * @author Andrii Chernysh
 * @version 1.0 27 Nov 2016
 */
public class InstanceHolderSingleton {
    private InstanceHolderSingleton() {
    }

    private static class Holder {
        private static final InstanceHolderSingleton instance =
                new InstanceHolderSingleton();
    }

    public static InstanceHolderSingleton getInstance() {
        return Holder.instance;
    }
}
