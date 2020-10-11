import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String ans = "";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Set<Integer> ids = new HashSet<>();
		Person[] bestM = new Person[m];
		int bestCount = 0;
		for (int i = 0; i < n; ++i) {
			int id = sc.nextInt();
			int score = sc.nextInt();
			if (!ids.contains(id)) {
				ids.add(id);
				bestCount++;
				bestM[bestCount] = (new Perseon(id, score));
			} else {
				for (int j = 0; j < bestCount; ++j) {
					if (bestM[j].id == id){
						bestM[j].score += score;
					}
				}
			}
		}

		System.out.println(ans);
	}
	class Person {
		public int id;
		public int score;

		public Person(int id, int score) {
			this.id = id;
			this.score = score;
		}
	}

}