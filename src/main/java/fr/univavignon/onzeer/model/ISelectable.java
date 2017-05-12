package fr.univavignon.onzeer.model;

public interface ISelectable {
	/**
	 * check if an object match a criteria 
	 */
	public Boolean match(Criteria criteria);
}
