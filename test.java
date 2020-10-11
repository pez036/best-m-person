import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Person[] bestM = new Person[m];
        for (int i = 0; i < m; ++i) {
            System.out.print(bestM[i].id);
        }
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