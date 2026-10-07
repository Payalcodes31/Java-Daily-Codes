import java.util.Scanner ;
public class palimdrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int num = sc.nextInt();
		int reverse=0;
		int original1=num;
	    while (num!=0){
	        int n=num%10;
	        reverse=reverse*10+n;
	        num=num/10;
	}
	if (original1==reverse){
	    System.out.println("It is a palindrome");
	}
	else{
	    System.out.println("It is not a palindrome");
	}
	sc.close();
   }
}
