package fr.univavignon.onzeer.model;

import java.io.Serializable;
import java.util.Vector;

import javax.persistence.*;

@SuppressWarnings("serial") //the class is abstract
@Entity
public abstract class FileMetadata implements Serializable, ISelectable {
	/*
	 * 
	 */
	@Id
	private Long id;
	
	/**
	 * 
	 */
	private String title;
	
	/**
	 * 
	 */
	private String fileName;
	private Vector<Server> availableFileLocation;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public Vector<Server> getAvailableFileLocation() {
		return availableFileLocation;
	}
	public void setAvailableFileLocation(Vector<Server> availableFileLocation) {
		this.availableFileLocation = availableFileLocation;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}