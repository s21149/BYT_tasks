public class NonEmpty implements GlassState{

    Glass glass;

    public NonEmpty(Glass newGlass) {
        this.glass = newGlass;
    }

    @Override
    public void pourWater(int amount) {
        System.out.println("Pouring water...");
        glass.pourWater(amount);
    }

    @Override
    public void drinkFrom(int amount) {
        System.out.println("Drinking from the glass...");
        glass.drinkFrom(amount);
    }

    @Override
    public void drop() {
        System.out.println("You dropped the glass ...");
        glass.drop();
    }
}
