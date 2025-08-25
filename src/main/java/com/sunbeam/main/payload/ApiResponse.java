package com.sunbeam.main.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class ApiResponse {
	
	public ApiResponse(String message2, boolean b) {
		// TODO Auto-generated constructor stub
	}
	private String message;
	private boolean success;

}
