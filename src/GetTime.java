import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetTime implements Runnable{

	public static String time;
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		DateTimeFormatter d = DateTimeFormatter.ofPattern("hh:mm:ss");
		LocalTime nowT = LocalTime.now();
		
		while(true){
			nowT = LocalTime.now();
			time = nowT.format(d);
		}
	}
	

}
