package simple_1;

import java.util.HashSet;
import java.util.Set;

public class Kcomplementary {

	public int arrayJmp(int k, int[] A) {
		int response = 0;
		Set<String> combination = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++)
				if (A[i] + A[j] == k && !combination.contains(i + "," + j)) {
					combination.add(i + "," + j);
					response++;
				}
		}
		return response;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 2, 3, 1, 1, 3 };
		int[] B = new int[] {};
		int[] C = new int[] { 1, 1, -1, 1 };
		Kcomplementary solution = new Kcomplementary();
		System.out.println(solution.arrayJmp(6, A));
		System.out.println(solution.arrayJmp(5,B));
	}
}