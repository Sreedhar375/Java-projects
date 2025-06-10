package f;

import java.util.*;

public class Bfs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<String>> m=new HashMap<String, List<String>>();
		
		m.put("Entrance", Arrays.asList("Reptile House","Bird Sancturary","Mammal Zone"));
		m.put("Reptile House",Arrays.asList("Snake pit"));
		m.put("Bird Sancturary",Arrays.asList("Parrot Pavilion"));
		m.put("Mammal Zone", Arrays.asList("Lion Den","Elephant Closure"+ ""));
		m.put("Snake pit", new ArrayList<String>());
		m.put("Parrot Pavilion", new ArrayList<String>());
		m.put("Elephant Closure", new ArrayList<String>());
		m.put("Lion Den", new ArrayList<String>());
		System.out.println("The Entrance of the zoo starts with:");
		bfs(m,"Entrance");
		

	}
	public static void bfs(Map<String, List<String>> h,String start) {
		Queue<String>q=new LinkedList<String>();
		Set<String>s=new HashSet<String>();
		q.add(start);
		s.add(start);
		while(!q.isEmpty()) {
			String c=q.poll();
			System.out.println("Visited:"+c);
			List<String> neighbors = h.get(c);
			for(String n: neighbors) {
				if(!s.contains(n)) {
					q.add(n);
					s.add(n);               
				}
			}
			
		}
		
	}

}
