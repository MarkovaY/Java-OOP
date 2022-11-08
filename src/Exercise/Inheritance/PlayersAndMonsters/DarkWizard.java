package Exercise.Inheritance.PlayersAndMonsters;

public class DarkWizard extends Wizard{

    public DarkWizard(String username, int level) {
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