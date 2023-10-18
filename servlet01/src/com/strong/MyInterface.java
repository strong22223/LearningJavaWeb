package com.strong;

import jakarta.servlet.Servlet;

public interface MyInterface extends Servlet {

    static void staticFuncation() {
        return
                ;
    }

    default void defaultFunction() {
        return;
    }

}
