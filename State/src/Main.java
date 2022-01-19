public class Main {

    public static void main(String[] args) {
        Glass glass = new Glass();
        glass.drinkFrom(5);
        glass.drinkFrom(5);
        glass.pourWater(5);
        Empty emptyGlass = new Empty(glass);

    }

}
