import Pokemon.*;

public class App {
    public static void main(String[] args) throws Exception {
        WaterFlyingPokemon gyrados = new WaterFlyingPokemon();
        gyrados.printInformation();
        gyrados.attack();
        gyrados.flyingAttack();
        gyrados.fly();
        gyrados.catchPokemon();
        gyrados.catchPokemon();
        gyrados.printInformation();
        Charmander charmander = new Charmander("Calcifer");
        charmander.printInformation();
        charmander.RenamePokemon();
        charmander.attack();
        Bulbasaur bulbasaur = new Bulbasaur();
        bulbasaur.attack();
        bulbasaur.hug();
        bulbasaur.hug(5);
        Squirtle squirtle = new Squirtle();
        squirtle.attack();
        Pokemon pokemon = new Pokemon("Nessie", "Lapras");
        pokemon.attack();
        pokemon.printInformation();
        for (int i = 0; i < 5; i++)
        {
            squirtle.levelUp();
        }
        squirtle.printInformation();
        for (int i = 0; i < 5; i++)
        {
            squirtle.levelUp();
        }
        squirtle.printInformation();
        DarkFirePokemon houndoom = new DarkFirePokemon();
        houndoom.Haunt();
        houndoom.SummonSatan();
        houndoom.buildCampfire();
        bulbasaur.feedBerries(7);
        bulbasaur.catchPokemon();
        bulbasaur.pollinates();
        squirtle.spash(10);
    }
}
