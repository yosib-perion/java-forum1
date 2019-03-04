package com.perion.forum1.java9;

public interface InterfaceExample {

    // available forever
    void normalInterfaceMethod();

    // available in java 8
    default void defaultMethodExample(){
        System.out.println("Hello ");
    }

    default void interfaceMethodWithDefault() {
        init();
    }

    default void anotherDefaultMethod() {
        init();
    }

    // private method available from java 9 can be used by other public default methods
    // This method is not part of the public API exposed by InterfaceExample
    private void init() {
        System.out.println("Initializing");
    }
}
