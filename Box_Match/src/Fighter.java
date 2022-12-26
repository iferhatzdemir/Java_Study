import java.util.Random;

public class Fighter {
    String name;
    int damage;
    int health;

    int weight;
    int lucky;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge,int lucky) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        if (dodge >= 0 && dodge <= 100) this.dodge = dodge;
        else this.dodge = 0;
        this.weight = weight;
        this.lucky = lucky;

    }

    int hit(Fighter foe) {
        System.out.println(this.name + "=>" + foe.name + " damage=" + this.damage);
        if (foe.isDodge()) {
            System.out.println("---___ " + foe.name + " blocked incoming damage" + "___---");
            return foe.health;
        }
        if (foe.health - this.health < 0) return 0;

        foe.health -= this.damage;
        return foe.health;
    }

    boolean isDodge() {
        Random random = new Random();
        int rand = random.nextInt(100);

        return rand <= this.dodge;
    }

}
