public class Main {

    public static void main(String[] args) {
        Glass glass = new Glass();
        glass.drinkFrom(100);
        glass.pourWater(100);
        glass.drinkFrom(100);
        glass.pourWater(100);
        glass.drinkFrom(50);
        glass.drinkFrom(50);
        glass.pourWater(250);
        glass.pourWater(250);
        glass.drop();
        glass.pourWater(50);
        glass.drinkFrom(50);
    }

}
