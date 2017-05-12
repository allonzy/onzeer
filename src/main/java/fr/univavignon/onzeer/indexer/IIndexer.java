package fr.univavignon.onzeer.indexer;

import java.util.List;

import javax.persistence.EntityExistsException;

import fr.univavignon.onzeer.exceptions.*;
import fr.univavignon.onzeer.model.*;

public interface IIndexer {
	/**
	 * Get all file indexed on the application 
	 * @return List<FileMetadata> a list off all file informations 
	 */
	public List<FileMetadata> listAllFile();

	/**
	 * Get a list off file matching {@link Criteria}
	 * @param criteria
	 * @return List<FileMetadata> a list off all file informations or null if nothing found
	 */
	public List<FileMetadata> listFileMatching(Criteria criterias);
	/**
	 * add a new file to the indexer
	 * @param metadata
	 * @throws DuplicateFileException
	 */
	public void addFile(FileMetadata metadata) throws EntityExistsException;
	/**
	 * remove a file from the indexer
	 * @throws FileNotFoundException
	 */
	public void removeFile(FileMetadata metadata) throws FileNotFoundException;
	/**
	 * List all the server indexed by the app
	 * @return List<Server> 
	 */
	public List<Server> getServers();
	/**
	 * Get the server for a given file
	 * @param file
	 * @return
	 */
	public List<Server> getServersContainingFile(FileMetadata file);

	/**
	 * 
	 * @param fileId
	 * @return
	 */
	public FileMetadata getFileById(int fileId);

	public AudioFileMetadata getFileByname(String fileName);
}
