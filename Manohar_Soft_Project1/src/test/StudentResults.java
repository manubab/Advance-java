package test;
public class StudentResults {
	public String results(float r) {
		if (r > 70 && r <= 100) {
			return "Distinction";
		} else if (r > 60 && r <= 70) {
			return "first Class";
		} else if (r > 50 && r <= 60) {
			return "Secon Class";
		} else if (r > 35 && r <= 50) {
			return "Third Class";
		} else {
			return "fail";
		}
	}
}
