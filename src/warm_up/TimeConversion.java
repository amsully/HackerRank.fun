package warm_up;
import java.util.*;

public class TimeConversion {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String time = scan.nextLine();
		
		String[] split = time.split(":");
		
		String hours = split[0];
		String minutes = split[1];
		String seconds = split[2].substring(0,2);
		String partition = split[2].substring(2,4);
//		System.out.println(hours + " "+ Integer.parseInt(hours));
//		System.out.println(partition);
		if(partition.equals("PM") && Integer.parseInt(hours) != 12)
		{
			hours = Integer.toString((Integer.parseInt(hours)+12));
		}else if(partition.equals("AM"))
			hours = Integer.toString((Integer.parseInt(hours)%12));
		
		if(hours.length() == 1)
			hours = "0" + hours;
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
	
}
