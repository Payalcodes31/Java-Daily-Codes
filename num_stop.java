import java.util.Scanner ;
public class num_stop {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for (int i=1;i<=10;i++){
		    System.out.println("enter the num:");
		    int num =sc.nextInt() ;
		    if (num==50){
		    System.out.println("Terminated!"); 
		    break;
	}
}
sc.close();
	}
}