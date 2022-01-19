public class Glass {

    GlassState empty;
    GlassState full;
    GlassState nonEmpty;
    GlassState broken;

    GlassState glassState;

    final int capacity = 250;
    int waterAmount = 0;

    boolean isBroken = false;

    public Glass() {
        empty = new Empty(this);
        full = new Full(this);
        nonEmpty = new NonEmpty(this);
        broken = new Broken(this);
        glassState = empty;


    }

    void setGlassState(GlassState newGlassState) {
        glassState = newGlassState;
    }

     public void pourWater(int amount) {
        if (amount + waterAmount >= capacity) {
            waterAmount = capacity;
            setGlassState(full);
        } else {
            waterAmount += amount;
            setGlassState(nonEmpty);
        }
    }

    public void drinkFrom(int amount){
        if (waterAmount - amount <= 0) {
            setGlassState(empty);
        } else {
            waterAmount -= amount;
        }
    }

    public void drop(){
        this.isBroken = true;
        setGlassState(broken);
    }

}
