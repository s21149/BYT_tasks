import java.util.ArrayList;

public abstract class Colleague {

    private final Mediator mediator;
    private int colleagueCode;
    private final ArrayList<BoardMessage> messageStorage;
    private boolean needsMessage;

    public Colleague(Mediator newMediator) {
        mediator = newMediator;
        messageStorage = new ArrayList<>();
        needsMessage = false;
    }

    public void createAMessage(String content) {
        mediator.createAMessage(content, this.colleagueCode);
    }

    public void requestBoardMessages() {
        this.needsMessage = true;
    }

    public void setColleagueCode(int colleagueCode){
        this.colleagueCode = colleagueCode;
    }

    public int getColleagueCode() {
        return this.colleagueCode;
    }

    public void appendMessageStorage(BoardMessage message) {
        this.messageStorage.add(message);
    }

    public boolean getNeedsMessage(){return this.needsMessage;}

    public void messageReceived(){this.needsMessage = false;}

    public void getMessageStorage(){
        System.out.println("Stored messages : ===");
        int messageCounter = 1;
        for(BoardMessage message : this.messageStorage) {
            System.out.println("Message No. " + messageCounter);
            System.out.println(message);
            messageCounter++;
        }
        System.out.println("====");

    }

}
