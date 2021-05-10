package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="job_advertisements")
@Entity
@Data
public class JobAdvertisement {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="experience")
	private String experience;
	
	@Column(name="military_status")
	private String militaryStatus;
	
	@Column(name="education_level")
	private String educationLevel;
	
	@Column(name="company_sector")
	private String companySector;
	
	@Column(name="department")
	private String department;
	
	@Column(name="way_of_working")
	private String wayOfWorking;
	
	@Column(name="position_level")
	private String positionLevel;
	
	public JobAdvertisement() {}
	
	public JobAdvertisement(int id, int categoryId, String title, String description, Date date, String companyName,
			String city, String experience, String militaryStatus, String educationLevel, String companySector,
			String department, String wayOfWorking, String positionLevel) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.title = title;
		this.description = description;
		this.date = date;
		this.companyName = companyName;
		this.city = city;
		this.experience = experience;
		this.militaryStatus = militaryStatus;
		this.educationLevel = educationLevel;
		this.companySector = companySector;
		this.department = department;
		this.wayOfWorking = wayOfWorking;
		this.positionLevel = positionLevel;
	}
	
	
}
