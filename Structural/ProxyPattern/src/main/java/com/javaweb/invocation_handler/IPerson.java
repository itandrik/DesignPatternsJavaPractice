package com.javaweb.invocation_handler;

/**
 * Interface for proxy
 *
 * @author Andrii Chernysh
 */
public interface IPerson {
    String getName();

    void setName(String name);

    void rename(String new_name);
}
