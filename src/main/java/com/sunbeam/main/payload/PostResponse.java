package com.sunbeam.main.payload;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostResponse {

	private List<PostDto> content;
	private int pageNumber;
	private int pageSize;
	private int totalPage;
	private long totalElements;
	private boolean lastpage;
	public void setContent(List<PostDto> postDtos) {
		// TODO Auto-generated method stub
		
	}
	public void setPageNumber(int number) {
		// TODO Auto-generated method stub
		
	}
	public void setPageSize(int size) {
		// TODO Auto-generated method stub
		
	}
	public void setTotalElements(long totalElements2) {
		// TODO Auto-generated method stub
		
	}
	public void setTotalPage(int totalPages) {
		// TODO Auto-generated method stub
		
	}
	public void setLastpage(boolean last) {
		// TODO Auto-generated method stub
		
	}

}
