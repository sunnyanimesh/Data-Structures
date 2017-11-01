package graph;

public class FloysWarshal {

	public static void main(String[] args) {
		int m =99999;
		int[][] graph = new int[][]{{0, 4, m, m, m, m, m, 8, m},
            {4, 0, 8, m, m, m, m, 11, m},
            {m, 8, 0, 7, m, 4, m, m, 2},
            {m, m, 7, 0, 9, 14, m, m, m},
            {m, m, m, 9, 0, 10, m, m, m},
            {m, m, 4, 14, 10, 0, 2, m, m},
            {m, m, m, m, m, 2, 0, 1, 6},
            {8, 11, m, m, m, m, 1, 0, 7},
            {m, m, 2, m, m, m, m, m, 0}
           };
      calculatePath(graph);
	}

	private static void calculatePath(int[][] graph) {
		int n = graph[0].length;
		int[][] dist = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				dist[i][j] = graph[i][j];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(dist[i][j]+"\t");
			}
			System.out.println("");
	      }
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++)
				{
					if(dist[i][j] > dist[i][k] + dist[k][j])
					{
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
		}
	}
		System.out.println("");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(dist[i][j]+"\t");
			}
			System.out.println("");
	      }

}
}