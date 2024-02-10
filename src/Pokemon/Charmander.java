package Pokemon;
public final class Charmander extends FireType {
    public Charmander(){
        pokemon = "Charmander";
    }

    public Charmander(String alias){
        name = alias;
        pokemon = "Charmander";
    } 

    public void hug(){
        System.out.println(name + " hugs you!");
    }

    public void hug(int n){
        System.out.println(name + " hugs you " + n + " times awwwwww");
    }

    public void levelUp(){
        level++;
        if (level == 5)
        {
            evolve1();
        }
        if (level == 10)
        {
            evolve2();
        }
    }

    protected void evolve1(){
        System.out.println("Charmander has evolved to Charmeleon!");
        pokemon = "Charmeleon";
    }

    private void evolve2(){
        System.out.println("Ivysaur has evolved to Venusaur!");
        pokemon = "Charizard";
        }
    }