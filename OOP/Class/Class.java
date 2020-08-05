package Definitions_and_Examples.Definition.OOP.Class;

public class Class {

    static class Bicycle {
        // Class is the blueprint for the Bicycle.
        // Bicycle is known as an instance of the class of object.

        int cadence = 0; // field
        int speed = 0; // field
        int gear = 1; // field
        // These are the field part that represent the object's state.

        void changeCadence(int newValue) {
            cadence = newValue;
        }

        void changeGear(int newValue) {
            gear = newValue;
        }

        void speedUp(int increment) {
            speed = speed + increment;
        }

        void applyBrakes(int decrement) {
            speed = speed - decrement;
        }

        void printStates() {
            System.out.println("cadence:" +
                    cadence + " speed:" +
                    speed + " gear:" + gear);
        }
    }

    static class BicycleDemo {
        public static void main(String[] args) {

            // Create two different
            // Bicycle objects
            Bicycle bike1 = new Bicycle();
            Bicycle bike2 = new Bicycle();

            // Invoke methods on
            // those objects
            bike1.changeCadence(50); // methods
            bike1.speedUp(10); // methods
            bike1.changeGear(2); // methods
            bike1.printStates(); // methods
            // these are methods

            bike2.changeCadence(50);
            bike2.speedUp(10);
            bike2.changeGear(2);
            bike2.changeCadence(40);
            bike2.speedUp(10);
            bike2.changeGear(3);
            bike2.printStates();
        }
    }

}
