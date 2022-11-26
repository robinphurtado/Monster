import java.util.HashMap;

/**
 * Name: Robin Hurtado
 * Date: 25 November 2022
 * Explanation: Kobold extends Monster class. Kobold appears to be a type of monster with its own Hashmap of objects and its
 * own values for hp, maxHP, and xp.
 * Kobold toString prints a custom toString
 */
public class Kobold extends Monster{

    //Kobold constructor takes parameters for maxHP, Integerxp, Hashmap items, and passes them as parameters to the
    //Monster Constructor
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    //Kobold toString appends "Kobold has " to the Monster toString
    @Override
    public String toString() {
        return "Kobold has: " + super.toString();
    }
}
