package org.giste.util;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for {@link StringUtil} class.
 * 
 * @author Giste
 */
public class StringUtilTest {

	@Test
	public void testOfLenghtWithChar() {
		char character = 'b';
		int length = 10;

		String readString = StringUtil.ofLengthWithChar(length, character);

		assertThat(readString.length(), equalTo(length));
		for (int i = 0; i < length; i++) {
			assertThat(readString.charAt(i), equalTo(character));
		}
	}

	@Test
	public void testOfLenght() {
		char character = 'a';
		int length = 10;

		String readString = StringUtil.ofLength(length);

		assertThat(readString.length(), equalTo(length));
		for (int i = 0; i < length; i++) {
			assertThat(readString.charAt(i), equalTo(character));
		}
	}

}
