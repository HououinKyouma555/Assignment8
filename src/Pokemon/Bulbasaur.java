package Pokemon;
public final class Bulbasaur extends GrassType{
    public Bulbasaur(){
        pokemon = "Bulbasaur";
    }

    public Bulbasaur(String alias){
        name = alias;
        pokemon = "Bulbasaur";
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
        System.out.println("Bulbasaur has evolved to Ivysaur!");
        pokemon = "Ivysaur";
    }

    private void evolve2(){
        System.out.println("Ivysaur has evolved to Venusaur!");
        pokemon = "Venusaur";
        }
    }
