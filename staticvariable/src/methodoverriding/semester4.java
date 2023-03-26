package methodoverriding;

public class semester4  extends semester3 {
	public void studentname(String s) {
		System.out.println("student name is "+s);
	}
		public void maths(int m) {
			System.out.println("maths mark in semester4 is="+m);
		}
			public void english(int e) {
				System.out.println("english mark in semester4 is "+e);
			}
					public void tamil(int t) {
			
						System.out.println("tamil mark in semester4 is "+t);
					}
					public void totalmarks(int tm) {
						System.out.println("total mark in semester4 is"+tm);
					}

public static void main(String[]args){
	semester4 s1=new semester4();
	s1.studentname("sriram");
	s1.maths(90);
	s1.english(80);
	s1.tamil(85);
	s1.totalmarks(225);
	s1.studentname("selvam");
	s1.maths(90);
	s1.english(70);
	s1.tamil(45);
	s1.totalmarks(205);
}
}

