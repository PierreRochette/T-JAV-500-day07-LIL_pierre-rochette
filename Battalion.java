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

    public boolean fight() {
        if (characters.size() < 2) {
            return false;
        }

        Character character1 = characters.get(0);
        Character character2 = characters.get(1);
        int result = character1.compareTo(character2);

        if (result == 0) {
            characters.remove(0);
            characters.remove(0);
        } else if (result > 0) {
            characters.remove(1);
        } else {
            characters.remove(0);
        }

        return true;

    }

}
