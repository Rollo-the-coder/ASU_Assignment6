// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>

public class Weapon {
	private String name;
    private int maxDamage;

    //Default
    Weapon() {
        name = "Pointy Stick";
        maxDamage = 1;
    }

    //overloaded
    Weapon(String name, int maxDamage) {
        this.name = name;
        this.maxDamage = maxDamage;
    }

    //getters
    String getName() {
        return name;
    }

    int getMaxDamage() {
        return maxDamage;

    }

    //setters
    void setName(String n) {
        this.name = n;
    }

    void setMaxDamage(int n) {
        this.maxDamage = n;
    }

}