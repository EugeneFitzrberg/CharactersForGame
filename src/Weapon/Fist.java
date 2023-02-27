package Weapon;

public class Fist extends Weapon{
    public Fist(String name, int damage) {
        super(name, damage);
    }

    @Override
    int attack() {
        return this.damage;
    }
}
