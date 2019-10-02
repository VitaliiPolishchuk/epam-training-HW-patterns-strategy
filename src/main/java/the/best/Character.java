package the.best;

public class Character {
    private Strategy movingStrategy;
    private String characterClass;

    public Character(String characterClass) {
        this.characterClass = characterClass;
    }

    public void setWalkingStrategy(Strategy walkingStrategy) {
        this.movingStrategy = walkingStrategy;
    }

    public String move(String from, String to){
        return new StringBuffer(characterClass).append(" ")
                .append(movingStrategy.move()).append(" from ")
                .append(from).append(" to ").append(to).append(".").toString();
    }
}
