package com.charactercount;


import java.util.Arrays;
import java.util.List;

public class User {

	public static void main(String[] args) {
		Filter f= new Filter();
		Mapper m= new Mapper();
		
		List<String> list = Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra",
				"allanna", "allannah", "allessandra", "allianna", "allyanna","anastaisa", "anastashia", 
				"anastasia", "annabella", "annabelle","annebelle");
		
		list.stream().filter(f.nameStartingWithPrefix("aa")).
		map(m.getDistinctCharactersCount()).
		forEach( c -> System.out.println(c.getName()+" has "+c.getDistinctCharacterCount()+" distinct characters."));


	}
	
}
