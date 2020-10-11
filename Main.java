import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String ans = "";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (m > n) {
			throw new IllegalArgumentException("invalid input");
		}
		Map<Integer, Integer> pairs = new HashMap<>();
		for (int i = 0; i < n; ++i) {
			int id = sc.nextInt();
			int score = sc.nextInt();
			if (pairs.containsKey(id)) {
				pairs.replace(id, pairs.get(id)+score);
			} else {
				pairs.put(id, score);
			}
		}

		int[][] list = new int[pairs.size()][2];
		int i = 0;
		for (Map.Entry<Integer, Integer> entry: pairs.entrySet()) {
			list[i][0] = entry.getKey();
			list[i][1] = entry.getValue();
			++i;
		}
		
		Arrays.sort(list, new Comparator<int[]>() {
    		public int compare(int[] a, int[] b) {
        		return Integer.compare(b[1], a[1]);
    		}
		});

		for (int j  = 0; j < m; ++j) {
			System.out.print(list[j][0]);
			System.out.print(" ");
		}
	}


}