package backEnd.BrainBuddySpring.Keys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UserTropheeKey implements Serializable {
	@Column(name = "trophee_id")
	Integer tropheeId;

	@Column(name = "user_id")
	Integer userId;

	@Override
	public int hashCode() {
		return this.tropheeId + this.userId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj.hashCode() == this.hashCode())
			return true;
		else
			return false;
	}

}