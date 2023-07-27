package backEnd.BrainBuddySpring.Entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="sessions")
public class Sessions {
	@Id
	@Column(name="session_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sessionId;
	@Column
	private String token;
	@Column
	private Date expiration;
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users user;
	
	public Integer getSessionId() {
		return sessionId;
	}
	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getExpiration() {
		return expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	

}