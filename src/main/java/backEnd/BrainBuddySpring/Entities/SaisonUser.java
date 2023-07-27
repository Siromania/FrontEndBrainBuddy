package backEnd.BrainBuddySpring.Entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="saisonuser")
public class SaisonUser {
    
		@Id
		@Column(name="saisonuser_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer saisonUserId;
		@Column(name="placement")
		private Integer placement;
		@Column(name="datetime")
		private Date dateTime;
		@ManyToOne
		@JoinColumn(name="user_id")
		private Users user;
		@ManyToOne
		@JoinColumn(name="saison_id")
		private Saison saison;
		
		
		public Integer getSaisonUserId() {
			return saisonUserId;
		}
		public void setSaisonUserId(Integer saisonUserId) {
			this.saisonUserId = saisonUserId;
		}
		public Integer getPlacement() {
			return placement;
		}
		public void setPlacement(Integer placement) {
			this.placement = placement;
		}
		public Date getDateTime() {
			return dateTime;
		}
		public void setDateTime(Date dateTime) {
			this.dateTime = dateTime;
		}
		public Users getUser() {
			return user;
		}
		public void setUser(Users user) {
			this.user = user;
		}
		public Saison getSaison() {
			return saison;
		}
		public void setSaison(Saison saison) {
			this.saison = saison;
		}
		
		
}