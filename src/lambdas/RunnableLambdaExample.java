package lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		/**
		 * Runnable sem lambda
		 */
		
		Runnable legacyRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Implementação de runnable: Legado 1");
			}
		};
		
		new Thread(legacyRunnable).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Implementação de runnable: Legado 2");
			}
		}).start();
		
		
		/**
		 * Usando Java 8: Lambda sintaxe ()->{}
		 */ 
		
		Runnable lambdaRunnable = () -> {
			System.out.println("Implementação de runnable: Lambda 1");
		};
		
		new Thread(lambdaRunnable).start();
		
		// Lambda simplificada
		Runnable lambdaRunnable2 = () ->	System.out.println("Implementação de runnable: Lambda 2");
		new Thread(lambdaRunnable2).start();

		// Simplificada++ / Single line
		new Thread(()-> System.out.println("Implementação de runnable: Lambda 3")).start();
	}
}
