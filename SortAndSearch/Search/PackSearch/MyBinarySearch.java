package PackSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBinarySearch {

	public static void main(String[] args) {
		// Take input list and x from user
		Scanner in = new Scanner(System.in);
		int x = 0;
		System.out.println("Enter the search int	");
		x = in.nextInt();
		int listSize = 0;
		System.out.println("Enter the list size	");
		listSize = in.nextInt();
		List input = new ArrayList();
		for (int i = 0; i < listSize; i++) {
			System.out.println("Enter the list element	");
			input.add(in.nextInt());
		}

		System.out.println("searched: "+binarySearch(input, x));
	}

	static int binarySearch(List<Integer> input, Integer search) {
		// int length = input.size();
		int midIdx = (input.size() / 2) - 1;
		while (input.size() > 0 && midIdx > -1) {
			System.out.println("input.size() : " + input.size());

			System.out.println("midIdx :" + midIdx);	
			if (input.get(midIdx) == search) {
				return midIdx;
			} else {
				if (input.get(midIdx) > search) {
					System.out.println("inside if");
					input = input.subList(0, midIdx+1);
					System.out.println(input.size());
					midIdx = (input.size() / 2) - 1;
				} else {
					System.out.println("inside else");
					for(int inputelem: input) {
						System.out.print(" elem:"+ inputelem);
					}

					System.out.println();
					input = input.subList(midIdx + 1, input.size());
					System.out.println(input.size());
					midIdx = (input.size() / 2) - 1;
				}

			}
		}

		return -1;
	}
}
