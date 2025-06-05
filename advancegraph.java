package demo;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class advancegraph {
	static class graph{
	private Map<Integer,List<Integer>> a=new HashMap<Integer, List<Integer>>();
	void addEdge(int u,int v) {
		a.computeIfAbsent(u, k ->new ArrayList<>()).add(v);
		a.computeIfAbsent(v, k-> new ArrayList<>()).add(u);
		
	}
	void printGraph() {
		for(int node:a.keySet()) {
			System.out.println("Node "+ node +" is connected to :");
		for(int neighbour:a.get(node)) {
			System.out.println(neighbour+" ");
		}
		System.out.println(" ");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g1=new graph();
		g1.addEdge(1, 2);
		g1.addEdge(3, 7);
		g1.printGraph();

	}

}
