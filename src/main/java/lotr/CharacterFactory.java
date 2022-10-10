package lotr;

//Character createCharacter() { returns random instance of any existing character }

import org.reflections.Reflections;

import static org.reflections.scanners.Scanners.SubTypes;

import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    public Character createCharacter() {
        Reflections reflections = new Reflections();
        Random randChoice = new Random();
        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());
        subTypes.remove(Noble.class);
        Character[] arr = (Character[]) subTypes.toArray();
        return arr[randChoice.nextInt(arr.length)];
    }


    public static void main(String[] args) {
        CharacterFactory a = new CharacterFactory();
        System.out.println(a.createCharacter());
    }
}
