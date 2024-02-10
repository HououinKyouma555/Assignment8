package Pokemon;
public abstract class WaterType extends Pokemon{
    public WaterType(){
        type = "Water";
    }

    public WaterType(String alias){
        name = alias;
        type = "Water";
    }
    public void attack(){
        waterGun();
    }

    public void spash(){
        System.out.println(name + " splahses around lol");
    }

    public void spash(int n){
        System.out.println(name + " splahses around for " + n + " hours");
    }

    protected void waterGun(){
        System.out.println(name + " uses Water Gun!");
        dealDamage();
    }

    private void dealDamage(){
        System.out.println("You deal " + level*2 + " damage");
    }
}
