package Weapon;

public class WaterGun extends Weapon{
    public WaterGun(String name, int damage) {
        super(name, damage);
    }

    @Override
    int attack() {
        return this.damage;
    }
}
