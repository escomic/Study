package test;

public class Test {

	//1.
	// "abcd" -> "dcba"
	public static void reverseString(String str){
		StringBuffer sb = new StringBuffer();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		System.out.print(str + " -> ");
		System.out.println(sb.toString());
	}
	
	//2.
	// a,b,c
	// aaa, aab, aac, aba, abb, abc, ....
	public static void combineChar(char[] data) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			char[] str = new char[data.length];
			str[0] = data[i];
			printLoop(1, data, str, sb);
		}
		System.out.println(sb);
	}

	public static void printLoop(int index, char[] data, char[] str, StringBuffer sb) {
		if (index == data.length) {
			sb.append(new String(str) + "\n");
			return;
		}

		for (int i = 0; i < data.length; i++) {
			str[index] = data[i];
			printLoop(index + 1, data, str, sb);
		}
	}
	
	public static void main(String[] args) {
//       reverseString("hello");
       
       char[] data = {'a','b','c'};
       combineChar(data);
       
	}
}
