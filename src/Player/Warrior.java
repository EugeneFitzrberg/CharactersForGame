package Player;

import Weapon.Weapon;

public class Warrior extends Character{
    public Warrior(String name, Weapon weapon, int heal) {
        super(name, weapon, heal);
    }

    @Override
    public void attack(Character enemy) {
        enemy.setDamage(this.weapon.getDamage());
    }

    @Override
    public void healing() {

    }

    @Override
    public void swapWeapon(Weapon weapon) {

    }

    @Override
    public void setDamage(int damage) {
        this.heal -= damage;
    }
}
