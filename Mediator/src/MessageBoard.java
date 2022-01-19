import java.util.ArrayList;


public class MessageBoard implements Mediator{
    private int colleagueID = 0;
    private int boardMessageID = 0;
    private final ArrayList<Colleague> users;
    private final ArrayList<BoardMessage> boardMessages;

    public MessageBoard() {
        this.users = new ArrayList<>();
        this.boardMessages = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.users.add(colleague);
        colleague.setColleagueCode(colleagueID);
        colleagueID ++;
    }

    @Override
    public void createAMessage(String content, int colleagueCode) {
        for (Colleague user : users) {
            if (user.getColleagueCode() == colleagueCode) {
                BoardMessage newMessage = new BoardMessage(colleagueCode + "", content, boardMessageID);
                this.boardMessages.add(newMessage);
                boardMessageID ++;
            }
        }
    }

    @Override
    public void sendContent(Colleague colleague) {
        for (BoardMessage message : boardMessages) {
            colleague.appendMessageStorage(message);
        }
    }

    @Override
    public void distributeMessages() {
        for (Colleague user : users) {
            if (user.getNeedsMessage()) {
                sendContent(user);
                user.messageReceived();
            }
        }
    }

    public void displayAllMessages() {
        for (BoardMessage message : this.boardMessages) {
            System.out.println(message);
        }
    }

}
