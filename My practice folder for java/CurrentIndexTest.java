	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.*;

	public class CurrentIndexTest{

@Test
	public void  testThatTheFunctionExist(){
		int[] numbers = {8,0,1,4,9,2};
	 MinMaxAtCurrentIndexFunction.atCurrentIndex(numbers);
	}
@Test
	public void testThatTheFunctionIsCorrect(){

	int [] numbers = {8,0,1,4,9,2};
	String actual = MinMaxAtCurrentIndexFunction.atCurrentIndex(numbers);

	String expected = "15, 24";
	assertEquals(actual,expected);


	}




}