package org.giste.util.dto;

/**
 * DTO for transfer values between client and server. Represents an entity that
 * can't be deleted and has an enabled/disabled state. As it's a subclass of
 * {@link BaseDto} it also has a Long identifier.
 * 
 * @author Giste
 */
public abstract class NonRemovableDto extends BaseDto {

	private static final long serialVersionUID = 5205366968827135823L;

	protected boolean enabled = false;

	/**
	 * Creates a new NonRemovableDto without state.
	 */
	public NonRemovableDto() {
	}

	/**
	 * Creates a new NonRemovableDto with an identifier and an enabled/disabled
	 * state.
	 * 
	 * @param id The identifier.
	 * @param enabled The enabled/disabled state.
	 */
	public NonRemovableDto(Long id, boolean enabled) {
		super(id);
		this.enabled = enabled;
	}

	/**
	 * Gets the enabled/disabled state of this DTO.
	 * 
	 * @return The enabled/disabled state.
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled/disabled state of this DTO.
	 * 
	 * @param enabled The enabled/disabled state.
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "NonRemovableDto [id=" + id + ", enabled=" + enabled + "]";
	}
}
