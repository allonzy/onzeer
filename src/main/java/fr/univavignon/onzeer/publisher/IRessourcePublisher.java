package fr.univavignon.onzeer.publisher;

import fr.univavignon.onzeer.model.FileMetadata;
import fr.univavignon.onzeer.model.Server;

public interface IRessourcePublisher {
	public void transferFileFrom(FileMetadata file, Server source, Server dest);
}
