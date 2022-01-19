public class CoffeeMachine {
    private MachineName name;
    private MachineParameters parameters;
    private int price;


    private CoffeeMachine(Builder builder) {
        this.name= builder.name;
        this.parameters = builder.parameters;
        this.price = builder.price;
    }

    public static class Builder {
        private MachineName name;
        private MachineParameters parameters;
        private int price;

        public Builder name(MachineName name) {
            this.name = name;
            return this;
        }

        public Builder parameters(MachineParameters parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public CoffeeMachine build() {
            return new CoffeeMachine(this);
        }
    }

    @Override
    public String toString() {
        return "Coffee machine name : " + this.name +
                "\nParameters : " + this.parameters +
                "\nPrice : " + this.price;
    }
}
