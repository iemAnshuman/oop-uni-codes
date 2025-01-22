class Brain {
    String species;
    int volume;
    int density;

    public void print_data() {
        // int volume = 0;
        System.out.println("brain data: " + this.species + " " + this.volume + " " + this.density);
    }


}

public class OOPS {
    // main 
    public static void main(String[] args) {
        Brain brain1 = new Brain();
        brain1.species = "human";
        brain1.volume = 100;
        brain1.density = 100;

        Brain brain2 = new Brain();
        brain2.species = "dog";
        brain2.volume = 50;
        brain2.density = 50;

        brain1.print_data();
        brain2.print_data();
    }
}