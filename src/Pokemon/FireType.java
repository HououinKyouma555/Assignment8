package Pokemon;
public abstract class FireType extends Pokemon {
    public FireType(){
        type = "Fire";
    }

    public FireType(String alias){
        name = alias;
        type = "Fire";
    }

    public void buildCampfire(){
        System.out.println(name + "builds a campfire (?)");
    }

    public void buildCampfire(int n){
        System.out.println(name + "builds a campfire that lasts " + n + " hours");
    }

    public void attack(){
        flameThrower();
    }

    protected void flameThrower(){
        System.out.println(name + " uses flamethrower!");
        dealDamage();
    }

    private void dealDamage(){
        System.out.println("You deal " + level*2 + " damage");
    }
}
