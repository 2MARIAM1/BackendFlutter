package model;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Poste {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private String cleaningType;
    private String location;
    private Long estimatedPrice;
    private Long surface;
    private Date serviceDate;
    private boolean booked;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructeurs, getters et setters

    public Poste() {
    }

  
    public Poste(Long id, String description, String cleaningType, String location, Long estimatedPrice, Long surface,
			Date serviceDate, boolean booked, User user) {
		super();
		this.id = id;
		this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getcleaningType() {
        return cleaningType;
    }

    public void setType(String cleaningType) {
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
    public String getCleaningType() {
		return cleaningType;
	}

	public void setCleaningType(String cleaningType) {
		this.cleaningType = cleaningType;
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

	public Date getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

}
