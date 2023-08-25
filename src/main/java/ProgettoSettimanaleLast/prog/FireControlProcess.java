package ProgettoSettimanaleLast.prog;

public class FireControlProcess {

    private CommunicationChannel communicationChannel;

    public FireControlProcess(CommunicationChannel communicationChannel) {
        this.communicationChannel = communicationChannel;
    }

    public void alert(int idSonda, double latitude, double longitude, int smokeLevel) {
        communicationChannel.sendAlert(idSonda, latitude, longitude, smokeLevel);
    }
}

