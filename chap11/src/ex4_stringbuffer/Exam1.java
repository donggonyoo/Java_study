package ex4_stringbuffer;

public class Exam1 {
	public static void main(String[] args) {
		System.out.println(delchar("(1!2@3$4~5)","~!@#$%^&*()"));
		System.out.println(delchar("(1!2@3$4~5)","12345"));
	}

	private static String delchar(String string, String string2) {
		StringBuilder sb = new StringBuilder();
		String s = new String();

		for (int i = 0; i < string.length(); i++) {
			//string2의인덱스에 string이 존재하지않는다면 append
//			if(string2.indexOf(string.charAt(i))<0) {
//				sb.append(string.charAt(i));
//			}
			if(!string2.contains(string.charAt(i)+"")){
				// ""을 추가해줌으로써 string형으로만들어주는거임
				s+=string.charAt(i);
			}
		}
		
		return s;
	}

}
