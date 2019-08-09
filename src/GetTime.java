import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetTime implements Runnable{

	public static String time;
	@Override
	public void run() {
		
		DateTimeFormatter d = DateTimeFormatter.ofPattern("hh:mm:ss");
		LocalTime nowT = LocalTime.now();
		
		while(true){
			nowT = LocalTime.now();
			time = nowT.format(d);
		}
	}
	

}
