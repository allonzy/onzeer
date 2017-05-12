package fr.univavignon.onzeer.indexer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import fr.univavignon.onzeer.exceptions.DuplicateFileException;
import fr.univavignon.onzeer.exceptions.FileNotFoundException;
import fr.univavignon.onzeer.model.AudioFileMetadata;
import fr.univavignon.onzeer.model.Criteria;
import fr.univavignon.onzeer.model.FileMetadata;
import fr.univavignon.onzeer.model.Server;
public class Indexer implements IIndexer {
	
	@PersistenceContext(unitName="Indexer")
	EntityManager em;
	
    @Id
    @GeneratedValue
    private Long id;
    
	@OneToMany
	private List<FileMetadata> fileList ;
	@OneToMany
	private List<Server> serverList ;

	
	@Override
	public List<FileMetadata> listFileMatching(Criteria criteria) {
		List<FileMetadata> selectedFile = new ArrayList<FileMetadata>();
		List<FileMetadata> fileList = this.listAllFile();
			for(FileMetadata file : fileList ){
				if(file.match(criteria)){
					selectedFile.add(file);
			}
		}
		return selectedFile;
	}

	@Override
	public void addFile(FileMetadata metadata) throws EntityExistsException {
		em.persist(metadata);
	}

	@Override
	public void removeFile(FileMetadata metadata) throws FileNotFoundException {
		em.remove(metadata);
	}

	@Override
	public List<Server> getServers() {
		return serverList;
	}
	public Server getServerById(int id) {
		return serverList.get(id);
	}
	@Override
	public List<FileMetadata> listAllFile() {
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
	public AudioFileMetadata getFileByname(String fileName) {
		AudioFileMetadata audioMetadata = new AudioFileMetadata();
		audioMetadata.setFileName("hotelCalifornia.mp3");
		return audioMetadata;
		
	}

}
