package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="categories")
@Entity
@Data
public class Category {

	@GeneratedValue
	@Id
	@Column(name="id")
	private int id;

	@Column(name="name")
	private String name;
	
	public Category() {}
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
