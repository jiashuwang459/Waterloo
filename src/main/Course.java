package main;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	Meta meta = new Meta();
	List<Data> data = new ArrayList<Data>();

	public Course() {
		
	}
	
	public Data getData() {
		return data.get(0);
	}
}
