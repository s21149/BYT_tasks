public class MachineParameters {
    private int width;
    private int height;
    private int depth;
    private int weight;
    private String color;

    private MachineParameters(Builder builder) {
        this.width = builder.width;
        this.height = builder.height;
        this.depth = builder.depth;
        this.weight = builder.weight;
        this.color = builder.color;
    }

    public static class Builder {
        private int width;
        private int height;
        private int depth;
        private int weight;
        private String color;

        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder depth(int depth) {
            this.depth = depth;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public MachineParameters build() {
            return new MachineParameters(this);
        }
    }
    @Override
    public String toString() {
        return "Width: " + this.width + ", Height: "+ this.height + ", Depth: " + this.depth +
                ", Weight: " + this.weight + ", Color: " + this.color;
    }
}
