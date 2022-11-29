package Seminar4;

public class Staff implements Weapon {

    @Override
    public Integer damage() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Staff: %d", damage());
    }
    
}
