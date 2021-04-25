// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>
import java.lang.Math;

public class Monster {
	private String name;
    private int healthScore;
    private Weapon weapon;
    
    Monster(String name, int healthScore, Weapon weapon) {
        this.name = name;
        this.healthScore = healthScore;
        this.weapon = weapon;
    }

    //getters
    String getName() {
        return name;
    }

    int getHealthScore() {
        return healthScore;
    }

    String getWeaponName() {
        return weapon.getName();
    }


    //create attack method
    //member methods
    int attack(Monster monster) {
        
        int weaponDamage = weapon.getMaxDamage();

        int damage = (int) (Math.random() * weaponDamage);
        
        monster.healthScore = monster.getHealthScore() - damage;

        return damage;
    }
}