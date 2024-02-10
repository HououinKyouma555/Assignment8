package Pokemon;
import java.util.Random;
import java.util.Scanner;

public class Pokemon {
    protected String[] names = new String[] {
        "Steve", "Tevin", "Carol", "Missy", "Ash",
        "Roland", "Rocky", "Kevin", "Mari", "Jedi",
    };
    protected String name;
    protected String type;
    protected String pokemon;
    protected int level;
    protected int friendship;
    private boolean isWild = true;

    public Pokemon() {
        Random random = new Random();
        int n = random.nextInt(10);
        name = names[n];
        type = "Normal";
        pokemon = "New Pokemon";
        level = 1;
        friendship = 1;
    }

    public Pokemon(String alias) {
        name = alias;
        type = "Normal";
        pokemon = "New Pokemon";
        level = 1;
        friendship = 1;
    }

    public Pokemon(String alias, String pkmn) {
        name = alias;
        type = "Normal";
        pokemon = pkmn;
        level = 1;
        friendship = 1;
    }

    public void RenamePokemon(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("What would you like to name your pokemon?");
        name = scnr.nextLine();
        scnr.close();
    }

    public void printInformation(){
        System.out.println("Pokemon: " + pokemon + "\nName: " + name + "\nType: " + type);
    }

    public void feedBerries(){
        System.out.println("You feed " + name + " some berries");
        System.out.println(name + " enjoyed the berries.");
        System.out.print("friendship has increased from " + friendship);
        friendship++;
        System.out.println(" to " + friendship + "!");
    }

    public void feedBerries(int n){
        System.out.println("You feed " + name + " " + n +  "berries");
        System.out.println(name + " enjoyed the berries.");
        System.out.print("friendship has increased from " + friendship);
        friendship++;
        System.out.println(" to " + friendship + "!");
    }

    public void attack(){
        tackle();
    }

    protected void tackle(){
        System.out.println(name + " uses tackle!");
    }

    public void levelUp(){
        level++;
    }

    public void catchPokemon(){
        if (isWild == true)
        {
        System.out.println("You have caught this pokemon!");
        isWild = false;
        }
        else{
            System.out.println("You have already caught this pokemon");
        }
    }
}
