package fr.univavignon.onzeer.command;

import java.net.Socket;

import fr.univavignon.onzeer.exceptions.*;
import fr.univavignon.onzeer.model.*;

public interface ICommandController {
	/**
	 * 
	 * @param audioFile
	 * @throws FileNotFoundException
	 */
	public void startAudioStreamingOf(Socket client,AudioFileMetadata audioFile) throws FileNotFoundException;
	
}
