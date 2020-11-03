import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {/// < Main.txt 하면 나오는데 정확히는 뭔지? 두번 연속으로 실행하면 0 나오고 끝남.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new HashSet<>();
		long totalTime = 0;
		
		try (Scanner in = new Scanner(System.in)) {
			while(in.hasNext()) {
				String word = in.next();
				long callTime = System.currentTimeMillis();
				words.add(word);
				callTime = System.currentTimeMillis() - callTime;
				totalTime += callTime;
			}
		}
		
		Iterator<String> iter = words.iterator();
		for(int i = 1; i <= 20 && iter.hasNext(); ++i) {
			System.out.println(iter.next());
		}
		
		System.out.println(words.size() + " : " + totalTime + "miliseconds");
	}
}
