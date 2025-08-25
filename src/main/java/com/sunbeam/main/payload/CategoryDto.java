package com.sunbeam.main.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoryId;
	
	@NotEmpty
	@Size(min= 10,max=50,message="minimum 10 character should be use for title")
	private String categoryTitle;
	
	@NotEmpty
	@Size(min= 10,max=500,message="minimum 10 character should be use for title")
	private String categoryDescription;

	public Object getCategoryTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCategoryDescription() {
		// TODO Auto-generated method stub
		return null;
	}


}
