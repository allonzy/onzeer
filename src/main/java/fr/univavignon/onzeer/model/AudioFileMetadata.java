package fr.univavignon.onzeer.model;

import javax.persistence.Entity;

@Entity
public class AudioFileMetadata extends FileMetadata{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3449676820621430915L;
	
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public Boolean match(Criteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}
}
