import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Name: Robin Hurtado
 * Date: 25 November 2022
 * Explanation: Driver java is the driver file that instantiates instances of Imp and Kobold objects, which inherit from abstract Monster Class
 * Driver puts 5 gold into Hashmap, instantiates an Imp object with 15 max HP and 20 XO, and a Kobold object with maxHP 1 and XP, then loops through the monsters
 * and calls their toString each in turn.
 */


public class Driver {


    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));

        for (Monster m : monsters) {
            System.out.println(m);
        }

    }

}
