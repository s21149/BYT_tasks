public class Person extends Colleague {

    public Person(Mediator newMediator) {
        super(newMediator);
        System.out.println("A person joined the board !");
    }
}
