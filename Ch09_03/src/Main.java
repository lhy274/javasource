
public class Main {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new Map<Integer, String>(5);
		for(int i = 0; i < 5; ++i) {
			m1.push(i, "value"+i);
		}
		String s = m1.get(2);
		System.out.println(s);
		
		for(int i = 0; i < m1.size(); ++i) {
			System.out.printf("key = %d, value = %s\n", i, m1.get(i));
		}
		
		Map<Double, String> m2 = new Map<Double, String>(5); ///2장 제네릭에는 Double 클래스 형식으로 대문자로 써주고, 나머지 테이터 타입에는 소문자로 쓰는구나
			for(int i = 0; i < 5; ++i)
				m2.push((double)i, "definition"+i);
			s = m2.get((double)4);///// push"key"+i == .get"key4 문자열이 맞아야하고 뒤의 숫자도 범위를 넘어서는 안됨.++ 대신 문자와숫자가 맞는다 할지라도 여기는 value값이 제대로 나오는데 아래 반복는뭉ㄴ value = null 널이뜸.
			System.out.println(s);
			//map 코드의 변수명 넣은 거랑은 관련 없구나.++++++=아 여기는 "key"라는 문자를 넣어주었네++==거기다가 19행이랑 24행 get값이 같아야함.
			for(int i = 0; i < m2.size(); ++i) {
				System.out.printf("key = %s, value = %s\n", "key"+i, m2.get((double)i));//여기도 key 값의 문자열을 받춰주면 제대로 나오네
	}
		
		
		int r = Util.max(10, 20);
		System.out.println(r);
		point r2 = Util.max(new point(1000, 2000), new point(100, 200)); //(1000, 100), 큰 경우인데 이런식으로 y값을 작게 해줘도 큰게 나오네
		System.out.printf("%d, %d\n", r2.getX(), r2.getY());
		String r3 = Util.max("당신을", "사람합니다.");
		System.out.println(r3);
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		/*
		Map<String, String> m2 = new Map<String, String>(5);
			for(int i = 0; i < 5; ++i)
				m2.push("key"+i, "definition"+i);
			s = m2.get("key4");///// push"key"+i == .get"key4 문자열이 맞아야하고 뒤의 숫자도 범위를 넘어서는 안됨.++ 대신 문자와숫자가 맞는다 할지라도 여기는 value값이 제대로 나오는데 아래 반복는뭉ㄴ value = null 널이뜸.
			System.out.println(s);
		//map 코드의 변수명 넣은 거랑은 관련 없구나.++++++=아 여기는 "key"라는 문자를 넣어주었네++==거기다가 19행이랑 24행 get값이 같아야함.
		for(int i = 0; i < m2.size(); ++i) {
			System.out.printf("key = %s, value = %s\n", "key"+i, m2.get("key"+i));//여기도 key 값의 문자열을 받춰주면 제대로 나오네
		}
		*/
		
	}
	
}
