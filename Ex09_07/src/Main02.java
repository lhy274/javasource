
public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  ÇÑ±Û ABCD egfh  ";
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') 
				result += str.substring(i, i + 1);
		}
		System.out.println("[" + str + "]");
		System.out.println("[" + result + "]");
	}

}
