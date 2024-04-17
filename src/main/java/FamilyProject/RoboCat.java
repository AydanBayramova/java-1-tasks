package FamilyProject;

public class RoboCat extends Pet implements CanFoul {


    public RoboCat(String species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("robo cat loves your owner"+super.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("foul method has robocat");
    }
}
