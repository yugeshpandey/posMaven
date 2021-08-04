package com.cloudmandu.pos.mapper;

public interface Mapper<T, U> {
	
	T map(U u);

}
