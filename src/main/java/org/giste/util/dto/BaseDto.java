package org.giste.util.dto;

import java.io.Serializable;

/**
 * Base DTO object form transfer values between client and server. It has the
 * following fields.
 * <ul>
 * <li>id: Unique identifier of club.
 * </ul>
 * 
 * @author Giste
 */
public class BaseDto implements Serializable {

	private static final long serialVersionUID = 3155521647879428294L;
	
	protected Long id = 0L;

	public BaseDto() {

	}

	public BaseDto(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseDto [id=" + id + "]";
	}

}
