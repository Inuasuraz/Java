import java.util.*;
public class lab2 {

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = kb.nextInt();
		int m = kb.nextInt();
		int q = kb.nextInt();
		
		Graph g = new Graph(100001);
		
		for (int i = 0 ; i < m ; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			g.addEdge(s, e);
		}
		
		for (int i = 0 ; i < q ; i++) {
			int t = kb.nextInt();
			int u = kb.nextInt();
			
			BreadthFirstPaths bfs = new BreadthFirstPaths(g, t);			
			if (bfs.hasPathTo(u)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}
