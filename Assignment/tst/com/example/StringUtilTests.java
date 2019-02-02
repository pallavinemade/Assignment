package com.example;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class StringUtilTests {

	@Test
	public void reverseStringWhenInputStringIsNull() {
		assertNull(StringUtil.reverseString(null));
	}
	
	@Test
	public void reverseStringWhenInputStringIsEmpty() {
		assertEquals("",StringUtil.reverseString(""));
	}
	
	@Test
	public void reverseStringWhenInputStringIsSingleChar() {
		assertEquals("a", StringUtil.reverseString("a"));
	}
	@Test
	public void reverseStringWhenInputStringLengthMoreThanOne() {
		assertEquals("abcd efgh", StringUtil.reverseString("hgfe dcba"));
		assertEquals("ivallaP si eman yM", StringUtil.reverseString("My name is Pallavi"));
	}
	
	@Test
	public void countWordsOccurencesWhenInputIsNull() {
		assertEquals("[]", StringUtil.countWordsOccurences(null));
	}
	
	@Test
	public void countWordsOccurencesWhenInputIsEmptyString() {
		assertEquals("[]", StringUtil.countWordsOccurences(""));
	}
	
	@Test
	public void countWordsOccurencesWhenInputIsSingleCharacter() {
		assertEquals("[{\"a\":1}]", StringUtil.countWordsOccurences("a"));
	}
	
	@Test
	public void countWordsOccurencesWhenInputStringLengthIsMoreThanOne() {
		String str="\"Walmart Technology is reinventing the way the world shops and we've only just begun. Our team includes @Walmart Labs in Silicon "  + 
				"Valley and Bengaluru, which powers the eCommerce experience, as well as technology teams across data and analytics, retail, back office and more who " + 
				"help power store and digital experiences";
		String output="[{\"Labs\":1},{\"data\":1},{\"back\":1},{\"begun.\":1},{\"office\":1},{\"experience\":1},{\"retail\":1},{\"analytics\":1},{\"across\":1},{\"eCommerce\":1},{\"world\":1},{\"reinventing\":1},{\"Technology\":1},{\"and\":5},{\"only\":1},{\"Silicon\":1},{\"power\":1},{\"just\":1},{\"which\":1},{\"digital\":1},{\"Bengaluru\":1},{\"teams\":1},{\"in\":1},{\"more\":1},{\"\"Walmart\":1},{\"is\":1},{\"includes\":1},{\"team\":1},{\"technology\":1},{\"store\":1},{\"Our\":1},{\"experiences\":1},{\"way\":1},{\"the\":3},{\"Walmart\":1},{\"help\":1},{\"as\":2},{\"we've\":1},{\"Valley\":1},{\"shops\":1},{\"well\":1},{\"powers\":1},{\"who\":1}]";
		assertEquals(output, StringUtil.countWordsOccurences(str));
	}
}
