package fr.univavignon.onzeer.model;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Criteria implements Map<String,String>  {
	private Map<String,String> criteriaMap;

	public Boolean match(FileMetadata file,int matchRate){
		int nbMatch = 0;
		return false;
	}
	//-----------------------------------------------
	@Override
	public int size() {
		return criteriaMap.size();
	}

	@Override
	public boolean isEmpty() {
		return criteriaMap.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return criteriaMap.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return criteriaMap.containsValue(value);
	}

	@Override
	public String get(Object key) {
		return criteriaMap.get(key);
	}

	@Override
	public String put(String key, String value) {
		return criteriaMap.put(key, value);
	}

	@Override
	public String remove(Object key) {
		return criteriaMap.remove(key);
	}

	@Override
	public void putAll(Map<? extends String, ? extends String> m) {
		criteriaMap.putAll(m);
		
	}

	@Override
	public void clear() {
		criteriaMap.clear();
	}

	@Override
	public Set<String> keySet() {
		return criteriaMap.keySet();
	}

	@Override
	public Collection<String> values() {
		return criteriaMap.values();
	}

	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet() {
		return criteriaMap.entrySet();
	}

}
