package com.charactercount;

public class CharactersCount {

	private String name;
	private int distinctCharacterCount;
	
	public CharactersCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CharactersCount(String name, int distinctCharacterCount) {
		super();
		this.name = name;
		this.distinctCharacterCount = distinctCharacterCount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDistinctCharacterCount() {
		return distinctCharacterCount;
	}
	public void setDistinctCharacterCount(int distinctCharacterCount) {
		this.distinctCharacterCount = distinctCharacterCount;
	}
	
	@Override
	public String toString() {
		return "CharacterCount [name=" + name + ", distinctCharacterCount=" + distinctCharacterCount + "]";
	}
	
}
