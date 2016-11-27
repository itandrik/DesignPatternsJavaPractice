package com.javaweb;

/**
 * Enum singleton
 * <p>
 * + Остроумно
 * + Сериализация из коробки
 * + Потокобезопасность из коробки
 * + Возможность использования EnumSet, EnumMap и т.д.
 * + Поддержка switch
 * - Не ленивая инициализация
 *
 * @author Andrii Chernysh
 * @version 1.0 27 Nov 2016
 */
public enum EnumSingleton {
    INSTANCE;
}
