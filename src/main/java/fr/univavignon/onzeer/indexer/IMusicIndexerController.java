package fr.univavignon.onzeer.indexer;

import java.util.List;

import fr.univavignon.onzeer.exceptions.DuplicateFileException;
import fr.univavignon.onzeer.exceptions.FileNotFoundException;
import fr.univavignon.onzeer.model.*;

public interface IMusicIndexerController extends IIndexerController {
	/**
	 * Get all music indexed on the application 
	 * @return List<FileMetadata> a list off all music informations 
	 */
	public List<AudioFileMetadata> listAllAudioFile();
	
	/**
	 * Get a list off music matching {@link Criteria}
	 * @param criteria 
	 * @return List<FileMetadata> a list off all music informations 
	 */
	public List<AudioFileMetadata> listAudioFileMatching(Criteria criteria);
	/**
	 * add a new file to the indexer
	 * @param metadata
	 * @throws DuplicateFileException
	 */
	public void addMusic(AudioFileMetadata metadata) throws DuplicateFileException;
	/**
	 * remove a file from the indexer
	 * @param metadata
	 * @throws FileNotFoundException
	 */
	public void removeMusic(AudioFileMetadata metadata) throws FileNotFoundException;
}
