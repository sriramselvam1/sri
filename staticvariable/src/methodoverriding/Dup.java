package methodoverriding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Dup {

	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("lava");
		names.add("sri");
		names.add("anu");
		names.add("ragu");
		Set<String> s=new HashSet<>();
		for(String name:names) {
			if(s.add(name)==false)
					System.out.println(name);
		}
		
		
		// TODO Auto-generated method stub

	}

}
