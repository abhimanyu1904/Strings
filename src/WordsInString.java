import java.util.*;
public class WordsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sentence:");
		String a=sc.nextLine();
		String []b=a.split("\\s+");
		System.out.println("The Total Word Count Is:"+b.length);
		sc.close();
	}
}
