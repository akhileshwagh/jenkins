package com.sunbeam.main.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min=4,message= "name should contain minimum 4 characters!!!!!")
	private String name;
	
	@NotEmpty
	@Size(min = 4,max=10,message ="password must be more than 4 char and less than 10!!!" )
	private String password;
	
	@NotEmpty
	@Email(message= "email is invalid!!!!!!")
	private String email;
	
	@NotEmpty
	@Size(min=20,message= "write atleast 20 characters!!!! ")
	private String about;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAbout() {
		// TODO Auto-generated method stub
		return null;
	}

}
