package com.nelioalves.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")

public class UserResource {
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User kauan = new User("1", "kauan","kauan@gmail.com");
		User alex = new User ("2", "alex", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(kauan,alex));
		return ResponseEntity.ok().body(list);
		
	}

}
