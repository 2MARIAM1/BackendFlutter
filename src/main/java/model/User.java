package model;

import java.io.Serializable;
import java.util.List;


import jakarta.persistence.*;

@Entity

public class User implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) // OR IDENTITY
    @Column(nullable = false, updatable = false)
    private Long id;

    private String fullName;
    private String cin;
    private String phoneNumber;
    private String email;
    private String password;
    private String region;
  private String registration_type;
   
	private String experience ;
	
	private Long availability ;
	@ElementCollection(fetch = FetchType.EAGER)
   private List<String> workdays;
	
   @ElementCollection(fetch = FetchType.EAGER)
   private List<String> cleaning_types;
   
	private Boolean equipment ;
   
	private String description ;
   
   public User() {};
    

    public User(Long id, String fullName, String cin, String phoneNumber, String email, String password, String region,
		String registration_type, String experience, Long availability, List<String> workdays,
		List<String> cleaning_types, Boolean equipment, String description) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.cin = cin;
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.password = password;
	this.region = region;
	this.registration_type = registration_type;
	this.experience = experience;
	this.availability = availability;
	this.workdays = workdays;
	this.cleaning_types = cleaning_types;
	this.equipment = equipment;
	this.description = description;
}




	public String getRegistration_type() {
		return registration_type;
	}


	public void setRegistration_type(String registration_type) {
		this.registration_type = registration_type;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public Long getAvailability() {
		return availability;
	}


	public void setAvailability(Long availability) {
		this.availability = availability;
	}


	public List<String> getWorkdays() {
		return workdays;
	}


	public void setWorkdays(List<String> workdays) {
		this.workdays = workdays;
	}


	public List<String> getCleaning_types() {
		return cleaning_types;
	}


	public void setCleaning_types(List<String> cleaning_types) {
		this.cleaning_types = cleaning_types;
	}


	public Boolean getEquipment() {
		return equipment;
	}


	public void setEquipment(Boolean equipment) {
		this.equipment = equipment;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
