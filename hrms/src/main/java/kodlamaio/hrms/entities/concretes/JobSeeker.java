package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="job_seekers")
@Entity
@Data
public class JobSeeker {


	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="nationality_id")
	private String nationalityId;
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	@Column(name="e_mail")
	private String eMail;
	@Column(name="password")
	private String password;
	
	public JobSeeker() {}
	
	public JobSeeker(int id, String firstName, String lastName, String nationalityId, Date dateOfBirth, String eMail,
			String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.eMail = eMail;
		this.password = password;
	}
}
