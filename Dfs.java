package f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* DFS Stands for Depth First Search DFS is like exploring a big house
 * where you kick one door and keep going deeper and deeper into rooms until 
 * there is no rooms left then you go back and try another way.
 */
public class Dfs {
	private Map<String, List<String>>h =new HashMap<String, List<String>>();
	private Set<String> v=new HashSet<String>();
	public void addRoom(String room,String connectedRoom) {
		h.computeIfAbsent(room, k-> new ArrayList<>()).add(connectedRoom);
		h.computeIfAbsent(connectedRoom, k-> new ArrayList<>()).add(room);
		
	}
	public void dfs(String currentRoom){
        if (v.contains(currentRoom)){
            return;
        }
        v.add(currentRoom);
        System.out.println("Visited: " + currentRoom);

        for(String neighbor : h.get(currentRoom)){
            dfs(neighbor);
        }
    }
    
		
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dfs h=new Dfs();
		h.addRoom("Living Room", "Kitchen");
		h.addRoom("Living Room", "Bedroom");
		h.addRoom("Bedroom", "Bathroom");
		System.out.println("DFS traversal starts:");
		h.dfs("Living Room");

	}

}
