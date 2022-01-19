public class Empty implements GlassState{

    Glass glass;

    public Empty(Glass newGlass) {
        this.glass = newGlass;
    }

    @Override
    public void pourWater(int amount) {
        System.out.println("Pouring water...");
        glass.pourWater(amount);
    }

    @Override
    public void drinkFrom(int amount) {
        System.out.println("Can't drink water, the glass is empty!");
    }

    @Override
    public void drop() {
        System.out.println("You dropped the glass ...");
        glass.drop();
    }
}
