package com.exoskeleton;

/**
 * Fill me in.
 * @author https://github.com/alexdforeman
 *
 */
public final class HelloWorld {

    private HelloWorld() { /* uninitializable */ }

    /**
     * Returns Hello World.
     * @return {@link String} Greeting
     */
    public static String getGreeting() {
        return "Hello World!";
    }

    /**
     * Main.
     * @param args_ Arguments.
     */
    public static void main(final String... args_) {
        System.out.println(getGreeting());
    }
}
