import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardMessage {
    private final String creator;
    private final String content;
    private final String timeStamp;
    private final int boardMessageID;

    public BoardMessage(String creator, String content, int boardMessageID) {
        this.creator = creator;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.content = content;
        this.timeStamp = dateTimeFormatter.format(LocalDateTime.now());
        this.boardMessageID = boardMessageID;
    }

    public String getContent() {
        return content;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public int getBoardMessageID() {
        return boardMessageID;
    }

    @Override
    public String toString() {
        return "FROM(ID) : " + this.creator + " time : " + this.timeStamp + " -> : \n \"" + this.content + "\"";
    }
}
