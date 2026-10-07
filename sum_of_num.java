import java.util.Scanner;
public class sum_of_num {
	public static void main(String[] args) {
		Scanner Sc= new Scanner (System.in);
		System.out.println("enter the num:");
		int num=Sc.nextInt();
		int sum=0;
		for (int i=1;i<=num;i++){
		    sum+=i;
		}
		System.out.println("Sum of all numbers:"+sum);
		Sc.close();
	}
}