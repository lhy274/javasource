
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] aa = new int[100];
		int [] bb = new int[100];
		
		for(int i = 0; i < aa.length; i++)
			aa[i] = i * 2;
		///for(int i = 0; i < aa.length; i++) ㅡㅡㅡ 이거 중괄호 안 묶어서 그런건가?
			///System.out.printf("%d 번째 일때 aa[]의 값은 %d이다\n", i, aa[i]);
		for(int i = 0; i < bb.length; i++) 
			bb[i] = aa[aa.length-(i+1)];
		for(int i = 0; i < bb.length; i++)
			System.out.printf("%d : %d\n", i, bb[i]);
	}

}
