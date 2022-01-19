public class Broken implements GlassState{

    Glass glass;

    public Broken(Glass newGlass) {
        this.glass = newGlass;
    }

    @Override
    public void pourWater(int amount) {
        System.out.println("The glass is broken!");
    }

    @Override
    public void drinkFrom(int amount) {
        System.out.println("The glass is broken!");
    }

    @Override
    public void drop() {
        System.out.println("The glass is broken!");
    }
}
