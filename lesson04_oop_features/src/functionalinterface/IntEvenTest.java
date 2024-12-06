package functionalinterface;

public class IntEvenTest implements IntTest {
	
	// Predicate
	@Override
	public boolean test(int number) {
		return number%2 == 1;
	}
	
}
