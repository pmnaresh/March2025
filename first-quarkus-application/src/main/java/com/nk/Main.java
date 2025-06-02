package com.nk;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain  // Optional: allows Quarkus to use this class as the main entry point
public class Main {

    public static void main(String... args) {
        Quarkus.run(args); // Starts the Quarkus application
    }
}

