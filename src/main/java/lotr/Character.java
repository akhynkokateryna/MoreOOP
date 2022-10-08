package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor

public abstract class Character {
    @Getter
    int hp;
    @Getter@Setter
    int power;

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public void kick(Character c) {
    }

    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp="+hp+", power="+power+"}";
    }
}
