import java.util.Arrays;
import java.util.Random;

public class practice_04 {

	public static void main(String[] args) {
		double[]arr = new double[8];
		Random rd = new Random();
		for(int i=0; i<=7; i++) {
		arr[i] = (double)rd.nextInt(9)+1;
		}
		System.out.print(Arrays.toString(arr));
		double sum = 0;
		for(int i=0; i<=7; i++) {
		sum += (double)arr[i];	
		}
		System.out.println(sum);
		double avg = 1;
		for(int i = 0; i<=7; i++) {
		avg = (double)sum/8;
	}
		System.out.println(avg);
	}	
}