package derek.onelinestoredemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="barcode")
	private String barcode;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="photolink")
	private String photolink;
	
	public Product() {
		
	}

	public Product(String barcode, String name, String description, String photolink) {
		this.barcode = barcode;
		this.name = name;
		this.description = description;
		this.photolink = photolink;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotolink() {
		return photolink;
	}

	public void setPhotolink(String photolink) {
		this.photolink = photolink;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", barcode=" + barcode + ", name=" + name + ", description=" + description
				+ ", photolink=" + photolink + "]";
	}
	
	
	
	
	
	
	
	
	

}
