package com.javatest.springboot.SignInWebApplication.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TodoServices {
	
	private  static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(1,"chandu","AWS",LocalDate.now().plusMonths(3),false));
		todos.add(new Todo(2,"chandu","JAVA",LocalDate.now().plusMonths(8),false));
		todos.add(new Todo(3,"chandu","Docker",LocalDate.now().plusMonths(6),false));
		todos.add(new Todo(4,"chandu","Spring",LocalDate.now().plusMonths(4),false));

	}
	
	public List<Todo> GetbyUsernames(String username)
	{
		return todos;
	}

}
