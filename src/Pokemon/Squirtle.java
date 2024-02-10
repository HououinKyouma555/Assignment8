package Pokemon;
public final class Squirtle extends WaterType {
    public Squirtle(){
        pokemon = "Squirtle";
    }

    public Squirtle(String alias){
        name = alias;
        pokemon = "Squirtle";
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
        System.out.println("Squirtle has evolved to Warturtle!");
        pokemon = "Warturtle";
    }

    private void evolve2(){
        System.out.println("Warturtle has evolved to Blastoise!");
        pokemon = "Blastoise";
        }
}
