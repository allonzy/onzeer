package fr.univavignon.onzeer.command;

import fr.univavignon.onzeer.exceptions.*;
import fr.univavignon.onzeer.model.*;

public interface ICommandController {
	/**
	 * 
	 * @param audioFile
	 * @throws FileNotFoundException
	 */
	public void startAudioStreamingOf(AudioFileMetadata audioFile) throws FileNotFoundException;
}
