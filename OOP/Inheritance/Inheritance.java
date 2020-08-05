package Definitions_and_Examples.Definition.OOP.Inheritance;

/**
 * Inheritance
 *  - OOp allows classes to inherit commonly used state and behavior from other classes.
 *  - Different kinds of objects often have a certain amount in common with each other.
 *  - each class is allowed to have one direct superclass, and each superclass has the potential
 *  for an unlimited number of subclasses.
 */
public class Inheritance {

    class Bicycle {

    }
    class MountainBike extends Bicycle { //
        /**
         * The syntax for Creating the subclass
         *  - use the 'extends' keyword at the beginning of class declaration.
         *  - it gives 'MountainBike' all the same fields(variables) and methods as 'Bicycle'.
         *  - yet it allows its code to focus 'exclusively' on the features that make it unique.
         *  - Furthermore, This makes "code for your subclasses easy to read".
         *
         */

        // new fields and methods defining
        // a mountain bike would go here

    }
}
