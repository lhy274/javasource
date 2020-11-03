
public class RegularDepart {
	private RegularEmployee [] rees;
	private int personCount;
	public RegularDepart() {
		rees = new RegularEmployee[5];
		int personCount = 0;
	}
	
	public void addRegularEmp(RegularEmployee r) {
		if(personCount < 5)
			rees[personCount++] = r;
	}
	public void displays() {
		for(int i = 0; i < personCount; ++i) { // 배열을 돌리는 거고 배열에는 5이상이 집게가 안되니까. [5] 이런식으로 안해도 되는구나.
			rees[i].displayEmployee();
			double pays = rees[i].payCheck(); // 이건 임프로이가 아니라 레귤러 임플로이에서 가져옴.
			System.out.printf("급여액 : %.0f 원\n", pays);
		}
	
	
	}
	
	
}
