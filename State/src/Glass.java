public class Glass {

    GlassState empty;
    GlassState full;
    GlassState nonEmpty;
    GlassState broken;

    GlassState glassState;

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
        this.glassState = newGlassState;
    }

     public void pourWater(int amount) {
        this.glassState.pourWater(amount);
    }

    public void drinkFrom(int amount){
        this.glassState.drinkFrom(amount);
    }

    public void drop(){
        this.glassState.drop();
    }

    public GlassState getBrokenState() {return broken;}
    public GlassState getNonEmptyState() {return nonEmpty;}
    public GlassState getFullState() {return full;}
    public GlassState getEmptyState() {return empty;}

}
