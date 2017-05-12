package fr.univavignon.onzeer.publisher.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;
import javax.naming.NamingException;

import fr.univavignon.onzeer.model.FileMetadata;
import fr.univavignon.onzeer.model.Server;
import fr.univavignon.onzeer.publisher.IStreamingPublisher;
import fr.univavignon.onzeer.publisher.TopicName;

public class StreamingPublisher extends QueuePublisher implements IStreamingPublisher {

	
	public StreamingPublisher() throws NamingException, JMSException{
		super(TopicName.STREAMING);
	}

	public URL streamFile(FileMetadata file, List<Server> servers) throws JMSException {
		TextMessage message = session.createTextMessage(file.getFileName());
		TextMessage textCallback = (TextMessage) this.publish(message);
		try{
			return new URL(textCallback.getText());
		}catch(MalformedURLException e1){
			e1.printStackTrace();
			return null;
		}
		//return (URL) callBack.getObject("url");
	}
}
