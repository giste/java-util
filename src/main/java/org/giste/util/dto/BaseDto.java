package org.giste.util.dto;

import java.io.Serializable;

/**
 * Base DTO object for transfer values between client and server. BaseDto has only 
 * an identifier.
 * 
 * @author Giste
 */
public abstract class BaseDto implements Serializable {

	private static final long serialVersionUID = 3155521647879428294L;
	
	protected Long id = 0L;

	/**
	 * Constructs a new BaseDto with default identifier (defaults to 0L).
	 */
	public BaseDto() {

	}

	/**
	 * Constructs a new BaseDto with an identifier.
	 * 
	 * @param id The identifier.
	 */
	public BaseDto(Long id) {
		this.id = id;
	}

	/**
	 * Gets the identifier of this DTO.
	 * 
	 * @return The identifier.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the identifier of this DTO.
	 * 
	 * @param id The identifier.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseDto [id=" + id + "]";
	}

}
