package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		/**
		 * Comparator sem lambda
		 */
		
		Comparator<Integer> legacyComparator1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("Comparando usando sintaxe legado: " + legacyComparator1.compare(5, 2));
		
		
		/**
		 * Usando Java 8: Lambda sintaxe ()->{}
		 */ 
		
		Comparator<Integer> lambdaComparator1 = (Integer o1, Integer o2) -> o1.compareTo(o2);

		Comparator<Integer> lambdaComparator2 = (o1, o2) -> o1.compareTo(o2);

		System.out.println("Comparando usando sintaxe lambda: " + lambdaComparator1.compare(5, 2));
		
		System.out.println("Comparando usando sintaxe lambda: " + lambdaComparator2.compare(5, 2));
	}

}
