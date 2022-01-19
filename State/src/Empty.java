public class Empty implements GlassState{
    Glass glass;

    public Empty(Glass newGlass) {
        this.glass = newGlass;
    }
    @Override
    public void pourWater(int amount) {
        System.out.println("Pouring water...");
        if (amount + glass.waterAmount >= 250) {
            System.out.println("Glass is full");
            glass.waterAmount=250;
            glass.setGlassState(glass.getFullState());
        } else {
            glass.waterAmount += amount;
            System.out.println("Finished pouring, water at : " + glass.waterAmount);
            glass.setGlassState(glass.getNonEmptyState());
        }
    }

    @Override
    public void drinkFrom(int amount) {
        System.out.println("Can't drink water, the glass is empty!");
        glass.setGlassState(glass.getEmptyState());
    }

    @Override
    public void drop() {
        System.out.println("You dropped the glass ...");
        glass.setGlassState(glass.getBrokenState());
    }
}
