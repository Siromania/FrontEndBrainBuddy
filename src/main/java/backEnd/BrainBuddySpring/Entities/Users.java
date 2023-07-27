package backEnd.BrainBuddySpring.Entities;

import jakarta.persistence.*;

import java.util.List;

import org.hibernate.Session;

@Entity
@Table(name="users")
public class Users {
	
    @Id
    @Column(name="saison_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private boolean isadmin;
	
	@OneToMany(mappedBy = "user")
	private List<UserTrophee> userTrophee;
	
	@OneToMany(mappedBy = "user")
	private List<Sessions> sessions;
	
	@OneToMany(mappedBy = "user")
	private List<Scores> scores;
	
	@OneToMany(mappedBy = "user")
	private List<SaisonUser> saisonUser;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}

	public List<UserTrophee> getUserTrophee() {
		return userTrophee;
	}

	public void setUserTrophee(List<UserTrophee> userTrophee) {
		this.userTrophee = userTrophee;
	}

	public List<Sessions> getSessions() {
		return sessions;
	}

	public void setSessions(List<Sessions> sessions) {
		this.sessions = sessions;
	}

	public List<Scores> getScores() {
		return scores;
	}

	public void setScores(List<Scores> scores) {
		this.scores = scores;
	}

	public List<SaisonUser> getSaisonUser() {
		return saisonUser;
	}

	public void setSaisonUser(List<SaisonUser> saisonUser) {
		this.saisonUser = saisonUser;
	}
	
}
