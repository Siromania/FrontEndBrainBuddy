package backEnd.BrainBuddySpring.Entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="saison")
@NamedQuery(name = "Saison.findByName", query="Select s from Saison s WHERE s.name LIKE :name")
public class Saison {
    
    @Id
    @Column(name="saison_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer saisonId;
    @Column(name="datedebut")
    private Date dateDebut;
    @Column(name="datefin")
    private Date dateFin;
    @Column(name="name")
    private String name;
    @ManyToOne
    @JoinColumn(name="game_id")
    private Games game;

    public Integer getSaisonId() {
        return saisonId;
    }

    public void setSaisonId(Integer saisonId) {
        this.saisonId = saisonId;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public Games getGame() {
        return game;
    }

    public void setGame(Games game) {
        this.game = game;
    }
}