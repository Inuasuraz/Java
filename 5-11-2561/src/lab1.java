import java.util.*;

public class lab1 {

	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		int count = 0;
		int n = kb.nextInt();
		Graph g = new Graph(1001);

		for (int i = 0; i < n; i++) {
			g.addEdge(kb.nextInt(), kb.nextInt());
		}

		for (int i = 0; i < 10; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();

			BreadthFirstPaths bfs = new BreadthFirstPaths(g, a);

			if (a == 0 && b == 0) {
				break;
			} else {

				for (int j = 0; j < 1001; j++) {
					if (bfs.distTo(j) > b) {
						count++;
					}
				}

				System.out.println(count);
				count = 0;

			}
		}

	}

}
