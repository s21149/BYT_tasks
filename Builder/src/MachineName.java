public class MachineName {
    private String companyName;
    private String modelName;
    private int serialNumber;


    private MachineName(Builder builder) {
        this.companyName = builder.companyName;
        this.modelName = builder.modelName;
        this.serialNumber = builder.serialNumber;
    }

    public static class Builder {
        private String companyName;
        private String modelName;
        private int serialNumber;

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Builder serialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public MachineName build() {
            return new MachineName(this);
        }
    }

    @Override
    public String toString() {
        return "Company name : " + this.companyName + ", Model name : " + this.modelName + ", Serial number: " + this.serialNumber;
    }

}
