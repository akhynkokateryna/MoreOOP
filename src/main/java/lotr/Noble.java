package lotr;

import java.util.Random;

public abstract class Noble extends Character{
    private static final Random randomGenerator = new Random();
    public Noble (int minHP, int maxHP, int minPow, int maxPow) {
        super(randomGenerator.nextInt(maxHP-minHP+1)+minHP, randomGenerator.nextInt(maxPow-minPow+1)+minPow);
    }

    @Override
    public void kick(Character whoKick) {
        whoKick.setHp(whoKick.getHp() - randomGenerator.nextInt(getPower()));
    }
}
