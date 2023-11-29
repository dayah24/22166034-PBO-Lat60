/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166034.pbo.lat60;

* Nama         : Nur Hidayah
* NIM          : 22166034 
* Mata Kuliah  : PBO 
* Prodi        : Sistem Informasi
// Semester 3

// Kelas Utama
class AkatsukiMember {
    protected String name;
    protected String rank;

    public AkatsukiMember(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name + ". I am an Akatsuki member with the rank of " + rank + ".");
    }
}

// Kelas Turunan 1
class NarutoCharacter extends AkatsukiMember {
    protected String ability;

    public NarutoCharacter(String name, String rank, String ability) {
        super(name, rank);
        this.ability = ability;
    }

    public void useAbility() {
        System.out.println(name + " uses " + ability + " to defeat enemies.");
    }
}

// Kelas Turunan 2
class MainAntagonist extends AkatsukiMember {
    private String mainAntagonistAttribute;

    public MainAntagonist(String name, String rank, String attribute) {
        super(name, rank);
        this.mainAntagonistAttribute = attribute;
    }

    public void doMainAntagonistAction() {
        System.out.println(name + " does something special: " + mainAntagonistAttribute);
    }
}

// Program Utama
class Akatsuki {
    public static void main(String[] args) {
        // Contoh penggunaan inheritance dan polimorfisme
        NarutoCharacter itachi = new NarutoCharacter("Itachi Uchiha", "S-Class", "Sharingan");
        MainAntagonist pain = new MainAntagonist("Pain", "Leader", "Mastermind plans");

        itachi.introduce();
        itachi.useAbility();

        System.out.println();

        pain.introduce();
        pain.doMainAntagonistAction();
    }
}
