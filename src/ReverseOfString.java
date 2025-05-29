import java.util.*;
public class ReverseOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String:");
		String a=sc.nextLine();
		System.out.println("The Reverse Of A String Is:");
		for(int i=a.length()-1;i>=0;i--){
			System.out.print(a.charAt(i));
		}
		sc.close();

	}

}
