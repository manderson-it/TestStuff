
public class TestStuff {

	/**
	 * Voodoo comparison of more than two values for equality.
	 */
  public static boolean areAllTheSame(int value, int... values) {
    for (final int i: values) if (value != i) return false;
    return true;
  }
	
	public static void main(String[] args) {
		int[] board = {0, 1, 0, 0, 0, 0, 0, 0, 0};
		if (board[0] == board[1]) { // compare two works, obviously, but not more than that.
			System.out.println("true");
		} else {
			System.out.println("nope");
		}
		/*
		Legacy:
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}

		Fancy:
			IntStream.range(0, 10).forEach(
				nbr -> System.out.println(nbr)
			);

			Why? ...because the execution of the following snippet takes 1 second and not 10 seconds:


			IntStream.range(0, 10).parallel().forEach(
				nbr -> {
				try {
					Thread.sleep(1000);
					} catch (InterruptedException ex) {}
			        	System.out.println(nbr);
			        }
			);
		*/
		
	}

}
