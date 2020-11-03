
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int total = 0;
		
		for (i = 1; i <= 1000; i++) {
			total = total + i;
			
			if(total >= 1000)
				break;
		}
		System.out.printf("1~1000의 합에서 최초로 1000이 넘는 위치는? %d번째 값:%d \n", i, total);
	}

}
