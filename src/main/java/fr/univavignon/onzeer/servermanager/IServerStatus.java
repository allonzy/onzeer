package fr.univavignon.onzeer.servermanager;
import java.util.List;

import fr.univavignon.onzeer.exceptions.*;
import fr.univavignon.onzeer.model.*;

public interface IServerStatus extends Runnable {
	/**
	 * 
	 * @return List<Server>
	 * @throws InterruptedException 
	 */
	public void updateServerStatus() throws InterruptedException;
	/**
	 * @param server
	 * @return
	 * @throws ServerNotFoundException
	 * @throws InterruptedException 
	 */
	public Boolean checkServerStatus(Server server) throws ServerNotFoundException, InterruptedException;
	/**
	 * 
	 * @param files
	 * @param server
	 * @return
	 * @throws ServerNotFoundException
	 */
	public Boolean checkFileOnServer(List<FileMetadata> files,Server server)throws ServerNotFoundException;
}
