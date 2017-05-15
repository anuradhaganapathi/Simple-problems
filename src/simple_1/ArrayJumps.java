package simple_1;

import java.util.HashSet;
import java.util.Set;

public class ArrayJumps {

	public int arrayJmp(int[] A) {
		int jumps = 0;
		int size = A.length;
		Set<Integer> visitedPositions = new HashSet<>();
		for (int i = 0; ; ) {
			if(visitedPositions.contains(i)){
				return -1;
			}else{
				visitedPositions.add(i);
				if(i > size-1 || i+A[i] > size ){
					return jumps;
				}else{
					jumps++;
				}
				i=i+A[i];
			}
		}
	}

	public static void main(String[] args) {
		int[] A = new int[] { 2, 3, 1, 1, 3 };
		int[] B = new int[] {};
		int[] C = new int[] { 1, 1, -1, 1 };
		ArrayJumps solution = new ArrayJumps();
		System.out.println(solution.arrayJmp(A));
		System.out.println(solution.arrayJmp(B));
		System.out.println(solution.arrayJmp(C));
	}
}