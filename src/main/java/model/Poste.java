package model;
import java.io.Serializable;
import java.time.LocalDate;


import jakarta.persistence.*;

@Entity
public class Poste {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String cleaningType;
    private String location;
    private Long estimatedPrice;
    private Long surface;
    private LocalDate serviceDate; 
    private boolean booked;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructeurs, getters et setters

    public Poste() {
    }

  
    public Poste(Long id, String cleaningType, String location, Long estimatedPrice, Long surface,
			LocalDate serviceDate, boolean booked, User user) {
		super();
		this.id = id;
		
		this.cleaningType = cleaningType;
		this.location = location;
		this.estimatedPrice = estimatedPrice;
		this.surface = surface;
		this.serviceDate = serviceDate;
		this.booked = booked;
		this.user = user;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcleaningType() {
        return cleaningType;
    }

    public void setcleaningType(String cleaningType) {
        this.cleaningType = cleaningType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

	public Long getEstimatedPrice() {
		return estimatedPrice;
	}

	public void setEstimatedPrice(Long estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}

	public Long getSurface() {
		return surface;
	}

	public void setSurface(Long surface) {
		this.surface = surface;
	}

	public LocalDate getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(LocalDate serviceDate) {
		this.serviceDate = serviceDate;
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

}
