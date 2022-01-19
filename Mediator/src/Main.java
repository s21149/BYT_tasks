public class Main {

    public static void main(String[] args) {
        MessageBoard messageBoard = new MessageBoard();
        Dog someDoggie = new Dog(messageBoard);
        Person me = new Person(messageBoard);

        // prior to adding colleagues to the mediator (users to the board), messages won't appear
        someDoggie.createAMessage("asd");
        me.createAMessage("Hello world");
        System.out.println("BEFORE ADDING ===");
        messageBoard.displayAllMessages();
        System.out.println("BEFORE ADDING ===");
        // adding users
        messageBoard.addColleague(someDoggie);
        messageBoard.addColleague(me);
        // now the display works
        someDoggie.createAMessage("");
        me.createAMessage("Hello world");
        someDoggie.createAMessage("");
        me.createAMessage("Hi again");
        messageBoard.displayAllMessages();
        // Interaction between colleagues by the means of the mediator (message board): Doggie will get my messages :
        System.out.println("Doggie's stored board messages prior to requesting them : ");
        messageBoard.distributeMessages();
        someDoggie.getMessageStorage();
        System.out.println("Doggie's stored board messages after requesting them : ");
        someDoggie.requestBoardMessages();
        messageBoard.distributeMessages();
        someDoggie.getMessageStorage();

    }

}
