package Pokemon;

import Types.DarkType;

public final class DarkWaterPokemon extends WaterType implements DarkType{
    public DarkWaterPokemon(){
        pokemon = "Cloyster";
    }

    public DarkWaterPokemon(String alias){
        name = alias;
        pokemon = "Cloyster";
    }

    public void hug(){
        System.out.println(name + " hugs you!");
    }

    public void hug(int n){
        System.out.println(name + " hugs you " + n + " times awwwwww");
    }


    public void Haunt(){
        System.out.println(name + "haunts you in your dreams");
    }

    public void SummonSatan(){
        System.out.println("You have summoned Satan. Count your days");
        Satan();
    }

    protected void Satan(){
        System.out.println("Satan turns out to be really chill. You get a bag of chips");
    }
}
