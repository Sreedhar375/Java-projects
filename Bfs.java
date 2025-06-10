package f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* BFS[Breadth First Search] mean exploring a graph level by level by checking all your closes friends
 then their friends. 
 BFS is mixture of Queue, LinkedList, Map,Set,Arrays, ArrayList, Hashmap
 */
public class Bfs {
	public static void main(String [] main) {
		Map<String, List<String>> h=new HashMap<String, List<String>>();
		h.put("Living room", Arrays.asList("Kitchen","Bedroom"));
		h.put("Kitchen", Arrays.asList("Bathroom"));
		h.put("Bedroom", Arrays.asList("Balcony"));
		h.put("Study Room", new ArrayList<String>());
		h.put("Bathroom", new ArrayList<String>());
		h.put("Balcony", new ArrayList<String>());
		System.out.println("Exploring the house using BFS start from living room:");
		bfs(h,"Living room");
	}
		public static void bfs(Map<String,List<String>>house,String start) {
			Queue<String>q=new LinkedList<String>();
			Set<String> v=new HashSet<>();
			q.add(start);
			v.add(start);
			while(!q.isEmpty()) {
				String currentRoom=q.poll();
				System.out.println("Visited:"+currentRoom);
				for(String n:house.get(currentRoom)) {
					if(!v.contains(n)) {
						q.add(n);
						v.add(n);
					}
				}
			
		}
		
	}
}
