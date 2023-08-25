package ProgettoSettimanaleLast.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgApplication.class, args);

		CommunicationChannel communicationChannel = new HttpCommunicationChannel();
		FireControlProcess controlProcess = new FireControlProcess(communicationChannel);
		FireSensor fireSensor = new FireSensor(controlProcess);

		// Simuliamo il rilevamento di un incendio con livello di fumo 6
		fireSensor.detectFire(6, 123, 40.7128, -74.0060);
	}

}
