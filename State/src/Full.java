public class Full implements GlassState {

    Glass glass;

    public Full(Glass newGlass) {
        this.glass = newGlass;
    }

    @Override
    public void pourWater(int amount) {
        System.out.println("Can't pour water, the glass is full!");
    }

    @Override
    public void drinkFrom(int amount) {
        System.out.println("Drinking from the glass.");
        drinkFrom(amount);
    }

    @Override
    public void drop() {
        System.out.println("You dropped the glass ...");
        glass.drop();
    }
}
