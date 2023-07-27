package backEnd.BrainBuddySpring.Entities;



import backEnd.BrainBuddySpring.Keys.UserTropheeKey;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="usertrophees")
public class UserTrophee {
	@EmbeddedId
	private UserTropheeKey id;
	
	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name="user_id")
	private Users user;
	
	@ManyToOne
	@MapsId("tropheeId")
	@JoinColumn(name="trophee_id")
	private Trophee trophee;

	public UserTropheeKey getId() {
		return id;
	}

	public void setId(UserTropheeKey id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Trophee getTrophee() {
		return trophee;
	}

	public void setTrophee(Trophee trophee) {
		this.trophee = trophee;
	}
	
}