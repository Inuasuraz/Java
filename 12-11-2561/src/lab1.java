import java.util.Scanner;
import java.util.Stack;

public class lab1 {

	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		int n = kb.nextInt();
		int m = kb.nextInt();

		EdgeWeightedDigraph g = new EdgeWeightedDigraph(n + 1);

		for (int i = 0; i < m; i++) {

			g.addEdge(new DirectedEdge(kb.nextInt(), kb.nextInt(), kb.nextDouble()));

		}

		int start = kb.nextInt();

		DijkstraSP dij = new DijkstraSP(g, start);

		for (int i = 0; i <= n; i++) {

			if (!Double.isInfinite(dij.distTo(i))) {
				Stack<DirectedEdge> st = dij.pathTo(i);
				System.out.print(start + " to " + i + " ( ");
				System.out.printf("%.2f",dij.distTo(i));
				System.out.print("):");

				
					System.out.print(" " + start);
				

				while (!st.isEmpty()) {
					DirectedEdge e = st.pop();
					System.out.print(" -> " + e.to());

				}
				System.out.println();

			}
		}

	}

}
