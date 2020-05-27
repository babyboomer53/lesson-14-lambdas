package exercises;

import java.util.List;
import java.util.stream.Collectors;

public class JobCandidateSelectorUsingLambdas {
	public static void main(String[] args) {

		// 1. Sort the candidates by salary requirements, low to high.

		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class

		// .filter (string -> JobCandidate.getTeacherName().contains("June") ==
		// true).sorted()
		JobCandidate.jobCandidates.stream()
				.filter(candidate -> candidate.getTeacherName().contains("June") == true)
				.sorted().collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
