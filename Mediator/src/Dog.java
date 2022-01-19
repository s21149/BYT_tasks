public class Dog extends Colleague {

    public Dog(Mediator newMediator) {
        super(newMediator);
        System.out.println("A doggie joined the board !");
    }

    @Override
    public void createAMessage(String content) {
        super.createAMessage("Woof woof");
    }
}
