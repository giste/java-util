package org.giste.util;

/**
 * Utility class for operations with strings.
 * 
 * @author Giste
 */
public class StringUtil {

	/**
	 * Creates a new string with the specified length populated with the
	 * specified character.
	 * 
	 * @param length The length of the string.
	 * @param character The character for populating the string.
	 * @return The created string.
	 */
	public static String ofLengthWithChar(int length, char character) {
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < length; i++) {
			buffer.append(character);
		}

		return buffer.toString();
	}

	/**
	 * Creates a new string with the specified length populated with character
	 * 'a'.
	 * 
	 * @param length The length of the string.
	 * @return The created string.
	 */
	public static String ofLength(int length) {
		return ofLengthWithChar(length, 'a');
	}
}
