
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc myCalc = new Calc();
		
		myCalc.addValue(1.0, 1.0);
		myCalc.addValue(1, 1);
		
		Calc pluse = new Calc();
		pluse.setAmount(20.0);

		System.out.println("°ªÀº : " + pluse.getAmount());

	}

}
