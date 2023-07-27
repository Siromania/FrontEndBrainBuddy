package backEnd.BrainBuddySpring.Entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="trophees")
public class Trophee {
	@Id
	@Column(name="trophee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tropheeId;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private String image;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="game_id")
	private Games game;
	
	@OneToMany(mappedBy = "trophee")
	private List<UserTrophee> userTrophee;
	

	public Games getGame() {
		return game;
	}

	public void setGame(Games game) {
		this.game = game;
	}

	public Integer getTropheeId() {
		return tropheeId;
	}

	public void setTropheeId(Integer tropheeId) {
		this.tropheeId = tropheeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<UserTrophee> getUserTrophee() {
		return userTrophee;
	}

	public void setUserTrophee(List<UserTrophee> userTrophee) {
		this.userTrophee = userTrophee;
	}
	
}