package edu.monmouth.grade;


public class Grade {
	//“A”,“A-“, “B”, “B+”, “B-“, “C”, “C+” and “INC”
	private final String UNKNOWN = "UNKNOWN";
	private String gradeLetter;
	//private double gradeValue;
	
	public Grade() {
		setGradeLetter(UNKNOWN);
	}
	
	
	public Grade(char gradeLetter) {
		setGradeLetter(Character.toString(gradeLetter));
		
	}
	public Grade(String gradeLetter) {
		setGradeLetter(gradeLetter);
	}
	
	public String getGradeLetter() {
		return gradeLetter;
	}
	
	public void setGradeLetter(String gradeLetter) {
	
		if (gradeLetter.equals("A")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("A-")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("B+")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("B")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("B-")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("C+")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("C")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("INC")) {	
			this.gradeLetter = gradeLetter;
		}
		else {
			this.gradeLetter = UNKNOWN;
		}
		
	}


	public double getGradeValue() {
		if(this.gradeLetter.equals("A")) {
			return 4;
		}
		
		if(this.gradeLetter.equals("-A")) {
			return 3.75;
		}
		
		if(this.gradeLetter.equals("B+")) {
			return 3.5;
		}
		
		if(this.gradeLetter.equals("B")) {
			return 3;
		}
		
		if(this.gradeLetter.equals("B-")) {
			return 2.75;
		}
		if(this.gradeLetter.equals("C+")) {
			return 2.5;
		}
		
		if(this.gradeLetter.equals("C")) {
			return 2;
		}
		
		if(this.gradeLetter.equals("INC")) {
			return 0;
		}
		
		if(this.gradeLetter.equals("UNKNOWN")) {
			return 0;
		}
		return 0;
	}


}
