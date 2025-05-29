public class Stringstartcapital {
	public static void main(String[] args) {
		String input="heLLo gOOD mornING";
		String []input1=input.split(" ");
		String output="";
		for(int i=0;i<input1.length;i++) {
			for(int j=0;j<1;j++) {
				char c=input1[i].charAt(j);
				output+=Character.toString(c).toUpperCase()+input1[i].substring(1).toLowerCase()+" ";
			}
		}
		System.out.print(output);
	}
}


