import java.io.*;
import java.util.*;  
class clock{
	public static double findAngle(int hour, int minute){
		if (hour == 12)
			hour = 0;
			if (minute == 60){
				minute = 0;
				hour += 1;
				if(hour>12)
				hour = hour-12;
				}
		double hour_angle = (double)(0.5 * (hour*60 + minute));
		double minute_angle = (double)(6*minute);
		double angle = Math.abs(hour_angle - minute_angle);
		angle = Math.min(360-angle, angle);
		return angle;
	}
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);     
		System.out.print("Enter hour : ");  
		int a= sc.nextInt();  
		System.out.print("Enter minute : ");  
		int b= sc.nextInt();  
		System.out.println(findAngle(a, b)+" degree");
	}
}

