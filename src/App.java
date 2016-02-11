
public class App {

	public static void main(String[] args) {
		
		
		//Inefficient
		String info ="";
		info +="Hello";
		info +=" ";
		info +="World";
		
		System.out.println(info);
		
		//StringBuffer is thread safe
		//StringBuilder not thread safe
		
		StringBuilder sb = new StringBuilder("");
		StringBuffer sBuff = new StringBuffer("");
		
		sb.append("My name is Bob");
		sb.append(" ");
		sb.append("I am a code tamer");
		
		
		
		sBuff.append("My name is Sally");
		sBuff.append(" ");
		sBuff.append("I am a code tamer");
		
		
		System.out.println(sb.toString());
		
		System.out.println(sBuff);
		
		

	}

}
