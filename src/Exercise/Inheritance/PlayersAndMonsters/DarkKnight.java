package Exercise.Inheritance.PlayersAndMonsters;

public class DarkKnight extends Knight {

    public DarkKnight(String username, int level) {
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