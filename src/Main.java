import Player.Character;
import Player.Warrior;
import Player.Witch;
import Weapon.Fist;
import Weapon.Pistol;
import Weapon.WaterGun;
import Weapon.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public void execBattle(){
        List<Weapon> weapons = new ArrayList<>();
        List<Character> characters = new ArrayList<>();

        Pistol pistol = new Pistol("Simple Pistol", 1);
        WaterGun waterGun = new WaterGun("Simple WaterGun", 2);
        Fist fist = new Fist("fist",3);

        Warrior warrior = new Warrior("Warrior",fist,10);
        Witch witch = new Witch("Witch",fist,12);


        weapons.add(pistol);
        weapons.add(waterGun);
        weapons.add(fist);

        characters.add(warrior);
        characters.add(witch);

        startBattle(characters,weapons);
    }

    private void startBattle(List<Character> characters, List<Weapon> weapons){
        Character winner = null;
        int step = 0;
        while(winner == null){
            step++;
            System.out.println("Раунд " + step);

            for(Character characterF : characters){
                for(Character characterS : characters){

                    int firstRand = ThreadLocalRandom.current().nextInt(0,weapons.size());
                    int secondRand = ThreadLocalRandom.current().nextInt(0,weapons.size());
                    characterF.setWeapon(weapons.get(firstRand));
                    characterS.setWeapon(weapons.get(secondRand));

                    if(characterF != characterS){
                        characterF.attack(characterS);
                        System.out.println("Персонаж " + characterF.getName() + " атаковал " + characterS.getName() + " оружием " + characterF.getWeapon().getName() + " c атакой " + characterF.getWeapon().getDamage());
                    }
                }
            }

            Character looser = null;
            System.out.println("Информация:" );
            for(Character characterF : characters){
                System.out.println(characterF.getName() + " Heal: " + characterF.getHeal() + " Weapon: " + characterF.getWeapon().getName());


                if(characterF.getHeal() <= 0){
                    looser = characterF;
                }
            }
            characters.remove(looser);
            System.out.println("");
            if(characters.size() == 1){
                winner = characters.get(0);
                System.out.println("\n\nПобедитель " + winner.getName());
            }
        }
    }

    public static void main(String[] args){
        Main main = new Main();
        main.execBattle();
    }
}
