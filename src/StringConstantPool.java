public class StringConstantPool {
	public static void main(String[] args) {
		String s1=new String("Kuppam");
		s1.concat("Engineering");
		String s2=s1.concat("College");
		s1=s1.concat("kuppam");
		System.out.println(s1);
		System.out.println(s2);

	}

}
