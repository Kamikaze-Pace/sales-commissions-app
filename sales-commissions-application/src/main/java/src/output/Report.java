package src.output;

import src.data.Salesman;

public abstract class Report {

	protected Salesman salesman;
	
	public abstract void saveFile();
}
