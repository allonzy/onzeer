package fr.univavignon.onzeer.publisher;
/**
 * List all topic available for the 
 * @author uapv1303077
 *
 */
public enum TopicName {
	SERVER_STATUS("server_status"),
	STREAMING("streaming");
	private final String name;
    /**
     * @param name
     */
	private  TopicName(String name){
        this.name = name;
	}
    /**
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return this.name;
    }
}
