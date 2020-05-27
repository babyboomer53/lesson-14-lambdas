package exercises;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JobCandidate implements Comparable<JobCandidate> {

	public static List<JobCandidate> jobCandidates = new ArrayList<JobCandidate>();

	static {
		JobCandidate june = new JobCandidate("June",
				Arrays.asList(
						new String[] { "adaptable", "scatty", "curious" }),
				650, "Vinny Wade", 1200000);
		JobCandidate jelena = new JobCandidate("Jelena", Arrays.asList(
				new String[] { "fast-learner", "goal-oriented", "persistant" }),
				60, "June Clark", 100000);
		JobCandidate alex = new JobCandidate("Alex",
				Arrays.asList(
						new String[] { "adaptable", "consistent", "friendly" }),
				130, "June Clark", 30000);
		JobCandidate ivana = new JobCandidate("Ivana",
				Arrays.asList(new String[] { "flexible", "responsible" }), 200,
				"June Clarke", 1000000);
		JobCandidate marina = new JobCandidate("Marina", Arrays.asList(
				new String[] { "responsible", "friendly", "team-mate" }), 250,
				"June Clarke", 1000000);
		JobCandidate marko = new JobCandidate("Marko",
				Arrays.asList(
						new String[] { "loyal", "friendly", "hardworker" }),
				40, "Andrija and June", 2000);
		JobCandidate milan = new JobCandidate("Milan",
				Arrays.asList(
						new String[] { "adaptable", "scatty", "curious" }),
				june.hoursSpentCoding / 3, "June Clark",
				june.salaryRequired * 2);
		JobCandidate vlada = new JobCandidate("Vladimir",
				Arrays.asList(new String[] { "open", "fair", "humorous" }), 700,
				"Joon Spoon", 1200);

		jobCandidates.add(june);
		jobCandidates.add(jelena);
		jobCandidates.add(alex);
		jobCandidates.add(ivana);
		jobCandidates.add(marina);
		jobCandidates.add(marko);
		jobCandidates.add(milan);
		jobCandidates.add(vlada);
	}

	private List<String> personalityTraits;
	private int hoursSpentCoding;
	private String teacherName;
	private int salaryRequired;
	private String name;

	public JobCandidate(String name, List<String> personalityTraits,
			int hoursSpentCoding, String teacherName, int salaryRequired) {
		super();
		this.name = name;
		this.personalityTraits = personalityTraits;
		this.hoursSpentCoding = hoursSpentCoding;
		this.teacherName = teacherName;
		this.salaryRequired = salaryRequired;
	}

	public String toString() {
		return "\n" + this.name + " "
				+ NumberFormat.getCurrencyInstance().format(this.salaryRequired)
				+ (this.teacherName.contains("June") ? " learned from the best"
						: " learned somehow");
	}

	public String getTeacherName() {
		return teacherName;
	}

	public int getSalaryRequired() {
		return salaryRequired;
	}

	@Override
	public int compareTo(JobCandidate c) {
		return this.getSalaryRequired() - c.getSalaryRequired();
	}
}
