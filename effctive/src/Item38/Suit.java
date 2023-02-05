package Item38;

//The typesafe enum pattern
public class Suit {

    public static final Suit CLUBS = new Suit("clubs");
    public static final Suit DIAMONDS = new Suit("diamonds");
    public static final Suit HEARTS = new Suit("hearts");
    public static final Suit SPADES = new Suit("spades");
    private final String name;

    private Suit(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Suit clubs = Suit.CLUBS;
        clubs.print();
    }

    public String toString() {
        return name;
    }

    public void print() {
        if (Suit.CLUBS.equals(this)) {
            System.out.println("clubs");
        } else if (Suit.DIAMONDS.equals(this)) {
            System.out.println("diamonds");
        } else if (Suit.HEARTS.equals(this)) {
            System.out.println("hearts");
        } else if (Suit.SPADES.equals(this)) {
            System.out.println("spades");
        }
    }
}
