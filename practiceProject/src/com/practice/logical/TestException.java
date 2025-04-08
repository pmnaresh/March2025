package com.practice.logical;

class VehicleException extends Exception {
    public VehicleException(String str) {
        super(str);  // Pass message to base Exception
        System.out.println("Thrown Vehicle Exception For: " + str);
    }
}

class CarException extends VehicleException {
    public CarException(String str) throws VehicleException {
        super(str);
        System.out.println("Thrown Car Exception For: " + str);
    }
}

class HatchbackException extends CarException {
    public HatchbackException() throws VehicleException {
        super("Hatchback");
    }
}

class SUVException extends CarException {
    public SUVException() throws VehicleException {
        super("SUV");
    }
}

public class TestException {
    public void testCar() throws CarException, VehicleException {
        testHatchback();
        testSUV();
    }

    public void testHatchback() throws VehicleException {
        throw new VehicleException("Hatchback");
    }

    public void testSUV() throws VehicleException {
        throw new SUVException();
    }

    public static void main(String[] args) {
        TestException testException = new TestException();
        try {
            testException.testCar();
        } catch (VehicleException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

