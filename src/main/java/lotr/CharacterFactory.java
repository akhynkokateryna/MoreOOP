package lotr;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import static org.reflections.scanners.Scanners.SubTypes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    @SneakyThrows
    static public Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Random randChoice = new Random();
        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());
        subTypes.remove(Noble.class);

        Class[] arr = new Class[subTypes.size()];
        int ind = 0;
        for (Class csl : subTypes){
            arr[ind] = csl;
            ind++;
        }

        Class selected = arr[randChoice.nextInt(arr.length-1)];
        Constructor selectedConstructor = selected.getConstructor();
        Character selectedCharacter = (Character) selectedConstructor.newInstance();
        return selectedCharacter;
    }

    public static void main(String[] args) {
        Character a = createCharacter();
        System.out.println(a);
    }
}
