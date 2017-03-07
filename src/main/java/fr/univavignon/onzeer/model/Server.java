package fr.univavignon.onzeer.model;

import javax.persistence.*;

@Entity
public class Server {
	/**
	 * 
	 */
	@Id
	public String serverAdress;
	/**
	 * 
	 */
	@Id
	public String serverPort;
	
	/**
	 * Store the state of the server
	 */
	public Boolean active;
	
	/**
	 * Store the free space of the server
	 */
	public Integer availableSpace;

}