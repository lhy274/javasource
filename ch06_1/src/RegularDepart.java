
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
		for(int i = 0; i < personCount; ++i) { // �迭�� ������ �Ű� �迭���� 5�̻��� ���԰� �ȵǴϱ�. [5] �̷������� ���ص� �Ǵ±���.
			rees[i].displayEmployee();
			double pays = rees[i].payCheck(); // �̰� �������̰� �ƴ϶� ���ַ� ���÷��̿��� ������.
			System.out.printf("�޿��� : %.0f ��\n", pays);
		}
	
	
	}
	
	
}
