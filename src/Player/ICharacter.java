package Player;

import Weapon.Weapon;

public interface ICharacter {
    public void attack(Character enemy);
    public void healing();
    public void swapWeapon(Weapon weapon);
    public void setDamage(int damage);
}
