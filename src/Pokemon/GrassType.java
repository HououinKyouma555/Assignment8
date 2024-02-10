package Pokemon;
public abstract class GrassType extends Pokemon {
    public GrassType(){
        type = "Grass";
    }

    public GrassType(String alias){
        name = alias;
        type = "Grass";
    }

    public void attack(){
        vineWhip();
    }

    public void pollinates(){
        System.out.println(name + " pollinates the environment");
    }

    public void pollinates(int n){
        System.out.println(name + " pollinates " + n + " flowers");
    }

    protected void vineWhip(){
        System.out.println(name + " uses vine whip!");
        dealDamage();
    }

    private void dealDamage(){
        System.out.println("You deal " + level*2 + " damage");
    }
}
