package ProgettoSettimanaleLast.prog;


import java.util.ArrayList;

public class FireSensor {

    private FireControlProcess controlProcess;

    public FireSensor(FireControlProcess controlProcess) {
        this.controlProcess = controlProcess;
    }

    public void detectFire(int smokeLevel, int idSonda, double latitude, double longitude) {
        if (smokeLevel > 5) {
            controlProcess.alert(idSonda, latitude, longitude, smokeLevel);
        }
    }
}
