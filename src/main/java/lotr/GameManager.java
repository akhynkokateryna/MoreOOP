package lotr;

import java.lang.reflect.InvocationTargetException;

import static lotr.CharacterFactory.createCharacter;

public class GameManager {
    static public void fight(Character c1, Character c2) {
        System.out.println("The fight will be between " + c1.toString() + " and "+c2.toString());
        while (c1.getHp() > 0 && c2.getHp() > 0) {
            if (c1.getClass().getSimpleName().equals("Hobbit") && c2.getClass().getSimpleName().equals("Hobbit")) {
                System.out.println("Buddies don't fight with each other :)");
                break;
            }
            c1.kick(c2);
            c2.kick(c1);
            System.out.println(c1.toString());
            System.out.println(c2.toString());
            System.out.println();
        }
        System.out.println("The game is finished!");
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Character character1 = createCharacter();
        Character character2 = createCharacter();
        fight(character1, character2);
    }
}
