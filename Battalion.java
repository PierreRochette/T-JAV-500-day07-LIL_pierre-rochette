import java.util.ArrayList;
import java.util.List;

public class Battalion<T extends Character> {

    private List<T> characters;

    public Battalion() {
        characters = new ArrayList<>();
    }

    public void add(List<T> newCharacters) {
        characters.addAll(newCharacters);
    }

    public void display() {
        for (Character character : characters) {
            System.out.println(character.getName());
        }
    }

}
