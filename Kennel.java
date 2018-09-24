public class Kennel {
    public DogBean[] buildDogs() {
        // Constructor: public DogBean(int legCount, String color, double height, String breed, String name) {
        DogBean db_one = new DogBean(3, "grey", 8.31, "Cocker Spaniel", "Fido");
        DogBean db_two = new DogBean(4, "black", 12.02, "Black Lab", "Blacky");
        DogBean db_three = new DogBean(4, "chocolate", 12.52, "Chocolate Lab", "Choco");
        DogBean db_four = new DogBean(4, "white", 11.67, "Poodle", "Poofy");
        DogBean db_five = new DogBean(4, "brown", 12.00, "Pug", "Fisty");
        // Put objects in an array
        DogBean[] dogArray = {db_one, db_two, db_three, db_four, db_five};
        return dogArray;
    }

    //display dogs as a stirng from array
    public void displayDogs(DogBean[] dogArray) {
        String output = "";
        for (int i = 0; i < dogArray.length; i++) {
            output += dogArray[i].toString() + " ";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        Kennel mb = new Kennel();
        DogBean[] allDogs = mb.buildDogs();
        mb.displayDogs(allDogs);
    }
}
