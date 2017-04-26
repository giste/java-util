package org.giste.util.dto;

public class NonRemovableDto extends BaseDto {

	private static final long serialVersionUID = 5205366968827135823L;

	protected boolean enabled = false;
	
	public NonRemovableDto() {
	}

	public NonRemovableDto(Long id, boolean enabled) {
		super(id);
		this.enabled = enabled;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "NonRemovableDto [id=" + id + ", enabled=" + enabled + "]";
	}
}
