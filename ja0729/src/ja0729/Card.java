package ja0729;

public class Card {
    int number; // instance variable
    String kind;

    // Default constructor
    Card() {
        number = 1;
        kind = "Spade";
    }

    // Constructor with parameters
    Card(int number, String kind) {
        this.number = number;
        this.kind = kind;
    }

}
