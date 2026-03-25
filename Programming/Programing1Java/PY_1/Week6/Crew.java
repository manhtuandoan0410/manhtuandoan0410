package Week6;

import java.util.ArrayList;

public class Crew {
	private ArrayList<Sailor> sailorList;
	
	//constructor - create empty list
	public Crew() {
		sailorList = new ArrayList<Sailor>();
	}
	
	//add sailor to crew
	public void addCrewMember(Sailor sailor) {
		sailorList.add(sailor);
	}

	public String toString() {
		String result = "";
		for (Sailor s : sailorList) {
			result += s.getName() + " (" + s.getEmail() + ")\n";
		}
		return result.trim();
	}
}
