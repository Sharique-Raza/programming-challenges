package abstraction;

public abstract class Bird implements Flyable {
    private final String breed;

    Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
