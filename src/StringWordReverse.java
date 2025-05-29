import java.util.*;
public class StringWordReverse {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The String:");
			String a=sc.nextLine();
			String b[]=a.split(" ");
			String c=" ";
			for(int i=0;i<b.length;i++) {
				for(int j=b[i].length()-1;j>=0;j--) {
					c=c+b[i].charAt(j);
				}
				c=c+" ";
			}
			for(int i=0;i<c.length();i++)
				System.out.print(c.charAt(i));
			sc.close();

		}

	}
