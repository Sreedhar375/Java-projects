package f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dfs1 {
	private Map<String, List<String>> m=new HashMap<String, List<String>>();
	private Set<String> s=new HashSet<String>();
	public void addPeople(String person,String connectedPerson) {
		m.computeIfAbsent(person, k-> new ArrayList<>()).add(connectedPerson);
		m.computeIfAbsent(connectedPerson, k-> new ArrayList<>()).add(person);
		
	}
	public void dfs(String Person) {
		if(s.contains(Person)) {
			return;
		}
		//List<String> c=m.get(Person);
		//if(c!=null) {
		
		s.add(Person);
		System.out.println("Connected:"+Person);
			for(String n:m.get(Person)) {
				
				dfs(n);
		}
		
			
		}
		
	
	public static void main(String [] args) {
		Dfs1 m=new Dfs1();
		m.addPeople("Sreedhar","Kushal");
		m.addPeople("Sreedhar", "Subbu");
		m.addPeople("Subbu", "Sai");
		m.addPeople("Subbu","Raju");
		m.addPeople("Raju", "Raghu");
		System.out.println("All the people are in the social circle:");
		m.dfs("Sreedhar");
		
	}

}
