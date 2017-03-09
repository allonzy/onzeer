package fr.univavignon.onzeer.model;


import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Server implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	public String serverAdress;
	public String getServerAdress() {
		return serverAdress;
	}

	public void setServerAdress(String serverAdress) {
		this.serverAdress = serverAdress;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getAvailableSpace() {
		return availableSpace;
	}

	public void setAvailableSpace(Integer availableSpace) {
		this.availableSpace = availableSpace;
	}

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

	@Override
	public String toString() {
		return serverAdress + ":" + serverPort;
	}
	

}