
public class StringLetterCount {
	public static void main(String hk[]) {
		String a="Balaji";
	
int length=a.length();
for(int i=0;i<length;i++) {
	char c=a.charAt(i);
	int count=0;
	for(int j=0;j<length;j++) {
		if(a.charAt(j)==c)
			count++;
	}
	if(count>1 && a.indexOf(c)==i)
		System.out.println("The Letter "+c+" Appeared "+count+" Times");
	if(count<=1)
	System.out.println("The Letter "+c+" Appeared "+count+" Times");
	
		
}	
	}
}
