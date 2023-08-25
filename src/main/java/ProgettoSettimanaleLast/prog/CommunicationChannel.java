package ProgettoSettimanaleLast.prog;

public interface CommunicationChannel {
    void sendAlert(int idSonda, double latitude, double longitude, int smokeLevel);
}
