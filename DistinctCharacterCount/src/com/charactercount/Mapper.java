package com.charactercount;

import java.util.function.Function;


public class Mapper {

	public static Function<String, CharactersCount> getDistinctCharactersCount(){
		
		return name->{
			int charCount = (int)name.chars().distinct().count();
			
			return new CharactersCount(name,charCount);
		};
	}
	
}
