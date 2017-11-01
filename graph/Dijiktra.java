package graph;

import java.util.ArrayList;
import java.util.Iterator;

public class Dijiktra {

	static class Vertex{
		int pos;
		int distance;
		Vertex parent;
		
		Vertex(int pos){
			this.pos = pos;
			distance = Integer.MAX_VALUE;
			parent = null;
		}
		
	}
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
		ArrayList<Vertex> list= new ArrayList<Vertex>();
		pQueue q =new pQueue(n);
		
		for(int i=0;i<n;i++){
			Vertex v= new Vertex(i);
			q.insert(v);
			
		}
		q.decreaseKey(S, 0,null);
	
		while(q.size != 0){
			Vertex u = q.extractMin();
			
			list.add(u);
			for(int i =0;i<n ;i++){
						if( graph[u.pos][i]!=0){
					Vertex v = q.search(i);
					if(v!=null)
					if(v.distance > u.distance + graph[u.pos][v.pos]){
						q.decreaseKey(v.pos, u.distance + graph[u.pos][v.pos] ,u);
					
					}
			
						}
		
			}
			}
	printList(list);
	}
	
	static void printList(ArrayList<Vertex> list){
		Iterator<Vertex> i = list.iterator();
		while(i.hasNext()){
			Vertex v = i.next();
			System.out.print( v.pos+" " + v.distance + "\n");
		}
	}
	static class pQueue {
		Vertex[] vertex;
		int size, capacity;
		
		int parentOf(int i) { return (i-1)/2;}
		int left(int i){return (i*2)+1;}
		int right(int i){return (i*2)+2;}
		pQueue(int capacity){
			this.capacity = capacity;
			this.size = 0;
			vertex = new Vertex[capacity];
		}
		
		void insert(Vertex ver){
			vertex[size] = ver;
			size++;
			int i = size-1;
			while (i!=0 && vertex[parentOf(i)].distance>vertex[i].distance ){
				swap(vertex,i,parentOf(i));
				i = parentOf(i);
			}
		}
		void MinHeapify(int i){
			  int l = left(i);
			    int r = right(i);
			    int smallest = i;
			    if (l < size && vertex[l].distance < vertex[i].distance)
			        smallest = l;
			    if (r < size && vertex[r].distance < vertex[smallest].distance)
			        smallest = r;
			    if (smallest != i)
			    {
			        swap(vertex,i,smallest);
			        MinHeapify(smallest);
			    }
		}
		Vertex extractMin(){
			 if (size <= 0)
			 {System.out.println("Empty");
			        return null;
			 }  if (size == 1)
			    {
			        size--;
			        return vertex[0];
			    }
			 
			    Vertex root = vertex[0];
			    vertex[0] = vertex[size-1];
			    size--;
			    MinHeapify(0);
			 
			    return root;
		}
		void decreaseKey(int pos, int new_val,Vertex p)
		{ 	int i=0;
			for(int j=0;j<size;j++){
			if(vertex[j].pos == pos)
				i= j;
			}
		    vertex[i].distance = new_val;
		    vertex[i].parent = p;
			while (i!=0 && vertex[parentOf(i)].distance>vertex[i].distance ){
				swap(vertex,i,parentOf(i));
				i = parentOf(i);
			}
		}
		
		Vertex search(int pos){
			for(int i=0;i<size;i++){
					if(vertex[i].pos == pos)
						return vertex[i];
			}
			return null;
		}
		void print(){
			for(int i=0;i<size;i++){
				System.out.print(vertex[i].pos + "," + vertex[i].distance + "       ");
		}
		}
		void swap (Vertex[] arr,int q,int p ){
			Vertex temp;
			temp = arr[p];
			arr[p] = arr[q];
			arr[q] = temp;
		}
	}
	
	
}
