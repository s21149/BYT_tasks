public class Main {
    public static void main(String[] args) {
        // Coffee machine :
        // Name : {CompanyName, ModelName, SerialNumber}
        // Parameters : {Dimensions, Weight, Color}
        // Price (This will be defined at the very end)
        MachineName coffeeMachineName = new MachineName.Builder().
                companyName("Sage").
                modelName("Barista Pro").
                serialNumber(12345).build();
        MachineParameters coffeeMachineParameters = new MachineParameters.Builder().
                width(50).
                height(50).
                depth(40).
                weight(12).
                color("White").build();
        CoffeeMachine newCoffeeMachine = new CoffeeMachine.Builder().
                name(coffeeMachineName).
                parameters(coffeeMachineParameters).
                price(999999).build();
        System.out.println(newCoffeeMachine);

    }
}
