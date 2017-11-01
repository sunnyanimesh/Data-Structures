package graph;


public class Bellmanford {
	

	public static void main(String[] args){
		int[][] graph = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                 };
            calculatePath(graph,0);
	}

	private static void calculatePath(int[][] graph, int S) {
		int n = graph[0].length;
		int[] dist = new int[n];
		for(int i=0;i<n;i++){
			dist[i] = Integer.MAX_VALUE;
		}
		dist[S] = 0;
		for(int i=0;i<n-1;i++){
			for(int u=0;u<n;u++)
			{
				for(int v=0;v<n;v++){
					if(graph[u][v]!=0){
						if(dist[v] > dist[u] + graph[u][v]){
							dist[v] = dist[u] + graph[u][v];
						}
					}
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(i + " :" + dist[i]);
		}
	}
	
}
