package backEnd.BrainBuddySpring.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="games")
public class Games {
	@Id
	@Column(name="game_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gameId;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private String instructions;
	
	
	public Integer getGameId() {
		return gameId;
	}
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
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
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	

}

