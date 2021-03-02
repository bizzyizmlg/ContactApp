package cst135n.w1.d1;

import java.io.Serializable;

public class Photo extends BaseContact implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String description;
	private String dateOfPhoto;
	private String fileName;
	
	
	
	@Override
	public String toString() {
		return "Photo [id=" + id + ", description=" + description + ", dateOfPhoto=" + dateOfPhoto + ", fileName="
				+ fileName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateOfPhoto() {
		return dateOfPhoto;
	}
	public void setDateOfPhoto(String dateOfPhoto) {
		this.dateOfPhoto = dateOfPhoto;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Photo(int id, String description, String dateOfPhoto, String fileName) {
		super(fileName, dateOfPhoto, id);
		this.id = id;
		this.description = description;
		this.dateOfPhoto = dateOfPhoto;
		this.fileName = fileName;
	}

}
