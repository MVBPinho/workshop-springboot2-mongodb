package com.pinho.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinho.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "a", "a");
		User maria1 = new User("12", "a1", "a1");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, maria1));
		return ResponseEntity.ok().body(list);

	}
}
