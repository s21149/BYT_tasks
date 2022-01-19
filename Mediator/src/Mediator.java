public interface Mediator {

    public void addColleague(Colleague colleague);
    public void createAMessage(String content, int colleagueCode);
    public void sendContent(Colleague colleague);
    public void distributeMessages();

}
