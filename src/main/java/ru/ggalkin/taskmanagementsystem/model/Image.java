package ru.ggalkin.taskmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String imagename;

	@Column(name = "")
	private String imageSize;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", imagename=" + imagename + "]";
	}


}
