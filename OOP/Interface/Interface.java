package Definitions_and_Examples.Definition.OOP.Interface;

/**
 * Interface
 *  - A collectioin of methods with no implementation.
 *  - forms a contract between the class and the outside world,
 *  and this contract is enforced at build time by the compiler.
 *  - is a group of related methods with empty bodies in its most common form.
 *  - OBJECT defines their interaction with the outside world through the 'methods'
 *  that they expose.
 *  - METHOD forms the 'interface' of the object with the outside world.
 *  - ex) TV buttons : 'interface' between user and the electrical wiring on the other side of its plastic casting.
 *  You press the "Power" to turn the TV on and off.
 */

public class Interface {
/**
 * for Example
 * A Bicycle's behavior
  */

    interface Bicycle {

    //  wheel revolutions per minute
        void changeCadence(int newValue);

        void changeGear(int newValue);

        void speedUp(int increment);

        void applyBrakes(int decrement);
    }

    /**
     * To implement this interface, the name of your class would change
     * (to a particular brand), and
     * use 'implements' keyword in the class declaration.
     *
     * Implementing an interface allows a 'class' to become more formal about the 'behavior'
     * it promises to provide.
     * Interface forms a contract between the class and the outside world,
     * and this contract is enforced at build time by the compiler.
     * if your class 'claims to implement an interface',
     * all methods defined by that interface must appear in its source code before the class
     * will successfully compile.
     * */

    class ACMEBicycle implements Bicycle {

        int cadence = 0;
        int speed = 0;
        int gear = 1;

        // The compiler will now require that methods
        // changeCadence, changeGear, speedUp, and applyBrakes
        // all be implemented. Compilation will fail if those
        // methods are missing from this class.

        public void changeCadence(int newValue) {
            cadence = newValue;
        }

        public void changeGear(int newValue) {
            gear = newValue;
        }

        public void speedUp(int increment) {
            speed = speed + increment;
        }

        public void applyBrakes(int decrement) {
            speed = speed - decrement;
        }

        void printStates() {
            System.out.println("cadence:" +
                    cadence + " speed:" +
                    speed + " gear:" + gear);
        }
    }
}
