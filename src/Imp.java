import java.util.HashMap;

/**
 * Name: Robin Hurtado
 * Date: 25 November 2022
 * Explanation: Imp extends Monster class. Imp appears to be a type of monster with its own Hashmap of objects and its
 * own values for hp, maxHP, and xp.
 * Imp toString prints a custom toString
 */

public class Imp extends Monster{

    //Imp constructor takes parameters for maxHP, Integerxp, Hashmap items, and passes them as parameters to the
    //Monster Constructor
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    //Imp toString appends "Imp has " to the Monster toString
    @Override
    public String toString() {
        return "Imp has : " + super.toString();
    }
}
