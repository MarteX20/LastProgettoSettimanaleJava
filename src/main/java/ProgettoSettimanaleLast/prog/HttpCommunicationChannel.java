package ProgettoSettimanaleLast.prog;

public class HttpCommunicationChannel implements CommunicationChannel {
    @Override
    public void sendAlert(int idSonda, double latitude, double longitude, int smokeLevel) {
        String url = "http://host/alarm?idsonda=" + idSonda + "&lat=" + latitude + "&lon=" + longitude + "&smokelevel=" + smokeLevel;
        System.out.println("Alert sent via HTTP: " + url);
    }
}
