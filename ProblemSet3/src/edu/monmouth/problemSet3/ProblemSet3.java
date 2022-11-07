package edu.monmouth.problemSet3;
import edu.monmouth.grade.Grade;

public class ProblemSet3{

	public static void main(String[] args) {
		Grade history = new Grade("B+");
		Grade math = new Grade("C");
		Grade english = new Grade("C+");
		Grade gym = new Grade("B");
		Grade bogus = new Grade("F");
		double lowestGrade = 0;
		double higestGrade = 0;
		double historyGrade = history.getGradeValue();
		double mathGrade = math.getGradeValue();
		double englishGrade = english.getGradeValue();
		double gymGrade = gym.getGradeValue();
		double bogusGrade = bogus.getGradeValue();
		
		
		System.out.println(history.getGradeLetter());
		System.out.println(history.getGradeValue());
		
		System.out.println(math.getGradeLetter());
		System.out.println(math.getGradeValue());
		
		System.out.println(english.getGradeLetter());
		System.out.println(english.getGradeValue());
		
		System.out.println(gym.getGradeLetter());
		System.out.println(gym.getGradeValue());
		
		System.out.println(bogus.getGradeLetter());
		System.out.println(bogus.getGradeValue());
		
		if(historyGrade > higestGrade) {
			higestGrade = historyGrade;
		}
		
		if(mathGrade < lowestGrade) {
			lowestGrade = mathGrade;
		}
		
		if(englishGrade < lowestGrade) {
			higestGrade = englishGrade;
		}
		
		if(gymGrade < lowestGrade) {
			higestGrade = gymGrade;
		}
		
		if(bogusGrade < lowestGrade) {
			higestGrade = bogusGrade;
		}
		
		System.out.println(lowestGrade);
		
		
		if(historyGrade > higestGrade) {
			higestGrade = historyGrade;
		}
		
		if(mathGrade > higestGrade) {
			higestGrade = mathGrade;
		}
		
		if(englishGrade > higestGrade) {
			higestGrade = englishGrade;
		}
		
		if(gymGrade > higestGrade) {
			higestGrade = gymGrade;
		}
		
		if(bogusGrade > higestGrade) {
			higestGrade = bogusGrade;
		}
		
		System.out.println(higestGrade);
		
	}
	
}