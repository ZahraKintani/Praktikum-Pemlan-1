package HeroBattle;

public class Hero {
    private String name;
    private double hp;
    private double attack;
    private double defense;

    Hero(){

    }
    
    Hero(String n, double h, double a, double d) {
        name = n;
        hp = h;
        attack = a;
        defense = d;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHp() {
        return hp;
    }

    public double getDefense() {
        return defense;
    }

    public void attack(Hero enemy) {
        double damage = attack - enemy.getDefense();
        if (damage < 0) {
            damage = 0; 
        }
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name + " menyerang " + enemy.name);
        System.out.println();
        System.out.println(name + " menyerang sebesar " + attack);
        System.out.println(enemy.name + " memiliki pertahanan sebesar " + enemy.getDefense());
        if (enemy.hp <=0) {
            enemy.hp = 0;
            System.out.println("Health " + enemy.name + " saat ini " + enemy.hp);
        } else {
            System.out.println("Health " + enemy.name + " saat ini " + enemy.hp);
        }
        System.out.println();
    }
}