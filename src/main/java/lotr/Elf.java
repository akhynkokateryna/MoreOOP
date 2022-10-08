package lotr;

public class Elf extends Character{
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character whoKick) {
        if (whoKick.power < this.power) {
            whoKick.setHp(0);
            System.out.println("Elf killed the enemy!");
        } else {
            whoKick.setPower(whoKick.getPower() - 1);
        }
    }
}
