package com.sunbeam.main.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;





import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "user_name", nullable = false, length = 255)
	private String userName;

	private String password;

	private String email;

	private String about;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Post> posts = new ArrayList<>();
	
	@OneToMany(mappedBy ="user",cascade = CascadeType.ALL)
	private Set<Comment> comments=new HashSet<>();
	
	
	//@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role", referencedColumnName = "id"))
	//private Set<Role> roles = new HashSet<>();

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}

	public void setAbout(Object about2) {
		// TODO Auto-generated method stub
		
	}

}
