package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="employers")
@Entity
@Data
public class Employer {

	@GeneratedValue
	@Id
	@Column(name="id")
	private int id;
	@Column(name="company_name")
	private String companyName;
	@Column(name="web_site")
	private String webSite;
	@Column(name="e_mail")
	private String eMail;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="password")
	private String password;
	
	public Employer() {}
	
	public Employer(int id, String companyName, String webSite, String eMail, String phoneNumber, String password) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webSite = webSite;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
}
