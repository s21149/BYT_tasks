public class NonEmpty implements GlassState{

    Glass glass;

    public NonEmpty(Glass newGlass) {
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
        System.out.println("Drinking from the glass...");
        if (amount > glass.waterAmount) {
            System.out.println("Glass is now empty");
            glass.waterAmount=0;
            glass.setGlassState(glass.getEmptyState());
        } else {
            glass.waterAmount -= amount;
            System.out.println("Finished drinking, water at : " + glass.waterAmount);
            glass.setGlassState(glass.getNonEmptyState());
        }
    }

    @Override
    public void drop() {
        System.out.println("You dropped the glass ...");
        glass.setGlassState(glass.getBrokenState());
    }
}
