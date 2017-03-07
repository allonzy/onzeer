package fr.univavignon.onzeer.servermanager;

import fr.univavignon.onzeer.model.*;
import fr.univavignon.onzeer.exceptions.*;

public interface IFileManager {
	/**
	 * Find the file via metadata, and lunch a copy of this file from a server containing this file
	 * to a registered server (param)
	 * @param server
	 * @param metadada
	 */
	public void addFileTo(Server server,FileMetadata metadada) throws FileNotFoundException,ServerNotFoundException;
	/**
	 * Find the file via metadata,and delete it from server
	 * @param server
	 * @param metadada
	 */
	public void removeFileFrom(Server server,FileMetadata metadada) throws FileNotFoundException,ServerNotFoundException;
}
