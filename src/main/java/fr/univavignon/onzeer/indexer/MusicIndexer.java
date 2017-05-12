package fr.univavignon.onzeer.indexer;

import java.util.List;

import javax.persistence.EntityExistsException;

import fr.univavignon.onzeer.exceptions.DuplicateFileException;
import fr.univavignon.onzeer.exceptions.FileNotFoundException;
import fr.univavignon.onzeer.model.AudioFileMetadata;
import fr.univavignon.onzeer.model.Criteria;
import fr.univavignon.onzeer.model.FileMetadata;
import fr.univavignon.onzeer.model.Server;

public class MusicIndexer implements IMusicIndexer {

	@Override
	public List<FileMetadata> listAllFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FileMetadata> listFileMatching(Criteria criterias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFile(FileMetadata metadata) throws EntityExistsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFile(FileMetadata metadata) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Server> getServers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Server> getServersContainingFile(FileMetadata file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileMetadata getFileById(int fileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AudioFileMetadata> listAllAudioFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AudioFileMetadata> listAudioFileMatching(Criteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMusic(AudioFileMetadata metadata) throws DuplicateFileException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMusic(AudioFileMetadata metadata) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AudioFileMetadata getFileByname(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

}
