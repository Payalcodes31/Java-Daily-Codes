import java.util.Scanner;
public class positive{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		for (int i=1;i<=10;i++){
		    System.out.println("enter the num:");
		    int num=sc.nextInt();
		    if (num<=0){
		        continue;
	}
	System.out.println("It is the positive number");
}
sc.close();
	}
}