package Pokemon;
import java.util.Random;

import Types.FlyingType;

public final class WaterFlyingPokemon extends WaterType implements FlyingType {
    public void fly(){
        System.out.println(name + " uses fly");
    }

    public void flyingAttack(){
        System.out.println(name + " uses Tornado!");
        tornado();
    }

    public WaterFlyingPokemon(){
        pokemon = "Gyrados";
    }

    public WaterFlyingPokemon(String alias){
        name = alias;
        pokemon = "Gyrados";
    }

    public void hug(){
        System.out.println(name + " hugs you!");
    }

    public void hug(int n){
        System.out.println(name + " hugs you " + n + " times awwwwww");
    }

    protected void tornado(){
        System.out.println("The tornado is so powerful that it decimates a nearby town!");
        Random random = new Random();
        int n = random.nextInt(10);
        if (n > 8)
        {
            System.out.println("You have angered the Gods. Arceus is summoned");
        }
    }
}
