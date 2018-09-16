package devops.numbers;
import org.junit.*;
import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	//@Test
	//public void numberOutOfRangeReturnsError() {
		//Assert.assertEquals( "Error", "Number out of range", numberWords.convert(1)) ;
	//}
	
	@Test
	public void testNumberConvSingleDigit() {
		
		//ConvertNumbersToWords objSingleDigit = new ConvertNumbersToWords();
		Assert.assertEquals(numberWords.convert(5).trim(), "five");

	}
	
	@Test
	public void testNumberConvDoubleDigit() {
		
		//ConvertNumbersToWords objDoubleDigit = new ConvertNumbersToWords();
		Assert.assertEquals(numberWords.convert(10).trim(), "ten");

	}
	
	@Test
	public void testNumberConvTripleDigit() {
		
		//ConvertNumbersToWords objTripleDigit = new ConvertNumbersToWords();
		Assert.assertEquals(numberWords.convert(123).trim(), "one hundred twenty three");

	}
	

}
