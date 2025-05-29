import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String:");
		String a=sc.nextLine();
		int count=0;
		a=a.toLowerCase();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='o'||a.charAt(i)=='i'||a.charAt(i)=='u')
					count++;
		}
		System.out.println("The Number Of Vowels In String Is:"+count);

	}

}
