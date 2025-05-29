import java.util.*;
public class LengthOfWordsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String:");
				String input=sc.nextLine();
				String []input1=input.split(" ");
				String output=" ";
				for(int i=0;i<input1.length;i++) {
					if(input1[i].length()>output.length()) {
						output=input1[i];
				}
	}
				System.out.println(output);
}
}
