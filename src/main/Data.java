package main;

import java.util.ArrayList;
import java.util.List;

public class Data {

	public String subject;
	public String catalog_number;
	public double units;
	public String title;
	public String note;
	public int class_number;
	public String section;
	public String campus;
	public String associated_class;
	public String related_component_1;
	public String related_component_2;
	public int enrollment_capacity;
	public int enrollment_total;
	public int waiting_capacity;
	public int waiting_total;
	public String topic;
	List<String> reserves = new ArrayList<String>();
	List<SpecificClass> classes = new ArrayList<SpecificClass>();
	List<String> held_with = new ArrayList<String>();
	public int term;
	public String academic_level;
	public String last_updated;
	
	public Data() {
		
	}
}

