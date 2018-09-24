public class DogBean extends MammalBean {
    // Definitions
    private String breed;
    private String name;

//    DogBean() {
//    }

    // Constructor
    public DogBean(int legCount, String color, double height, String breed, String name) {
        super(legCount, color, height);
        this.breed = breed;
        this.name = name;
    }

    // BREED GETTER/SETTER
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // NAME GETTER/SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
            return "The dog's breed is" + breed + '\'' +
                " and its name is " + name + '\'' +
                " and its leg count is " + getLegCount() + '\'' +
                " and its color is " + getColor() + '\'' +
                " and its height is " + getHeight();
    }
}
