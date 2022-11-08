package Exercise.Inheritance.PlayersAndMonsters;

public class Elf extends Hero {
    public Elf(String username, int level) {
        super(username, level);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }
}