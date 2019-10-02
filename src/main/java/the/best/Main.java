package the.best;

public class Main {
    public static void main(String[] args) {
        Character human = new Character("Human");
        human.setWalkingStrategy(new WalkStrategy());

        Character harpy = new Character("Harpy");
        harpy.setWalkingStrategy(new FlyStrategy());

        Character lizard = new Character("lizard");
        lizard.setWalkingStrategy(new WalkAndFlyStrategy());



        System.out.println(human.move("London", "Kyiv"));
        System.out.println(harpy.move("London", "Kyiv"));
        System.out.println(lizard.move("London", "Kyiv"));

    }
}
