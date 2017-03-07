package fr.univavignon.onzeer.servermanager;
import java.util.List;

import fr.univavignon.onzeer.exceptions.*;
import fr.univavignon.onzeer.model.*;

public interface IServerStatus {
	/**
	 * 
	 * @return List<Server>
	 */
	public List<Server> getServerDown();
	/**
	 * @param server
	 * @return
	 * @throws ServerNotFoundException
	 */
	public Boolean checkServerStatus(Server server) throws ServerNotFoundException;
	/**
	 * 
	 * @param files
	 * @param server
	 * @return
	 * @throws ServerNotFoundException
	 */
	public Boolean checkFileOnServer(List<FileMetadata> files,Server server)throws ServerNotFoundException;
}
