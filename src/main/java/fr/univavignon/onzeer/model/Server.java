package fr.univavignon.onzeer.model;


import java.io.Serializable;


public class Server implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	//public String serverAdress;
	
	/**
	 * Store the free space of the server
	 */
	public String getServerAdress() {
		return "";
		//return this.serverAdress;
	}

	public void setServerAdress(String serverAdress) {
		//this.serverAdress = serverAdress;
	}

	public Boolean getActive() {
		return true;
	}

	public void setActive(Boolean active) {
		
	}

}