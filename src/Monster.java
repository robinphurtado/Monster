import com.sun.jdi.event.StepEvent;

/**
 * Name: Robin Hurtado
 * Date: 25 November 2022
 * Explanation: Monster is an abstract class that contains hp, maxHP, and xp blues as well as a Hashmap of items. in part 00/02 it is not fully clear what the
 * monsters will do, but it appears from hp and xp and hashmap they remind me of Pokemon and that they may battle and they may be able to collect items to use that would be held in the
 * Hashmap.
 * Imp and Kobold implement Monster, and each has a toString() method that prefixes a custom String message to the Monster toString()
 */

import java.util.HashMap;
import java.util.Objects;

abstract class Monster {

    private Integer hp;
    private  Integer xp = 10;
    private  Integer maxHP;
    private HashMap<String, Integer> items;

    //constructor
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    //getters and setters

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }


    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getHp(), monster.getHp()) && Objects.equals(getXp(), monster.getXp()) && Objects.equals(getMaxHP(), monster.getMaxHP()) && Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }
    //toString will print out a fraction showing the current hp /the max HP of the monster
    @Override
    public String toString() {
        return
                "hp=" + hp + "/" + maxHP;
    }
}