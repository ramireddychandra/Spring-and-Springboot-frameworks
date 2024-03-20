package com.javatest.springboot.SignInWebApplication.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TodoServices {
	private  static List<Todo> todos = new ArrayList<>();
	private static int todoCount =0 ;

	static {
		todos.add(new Todo(++todoCount,"chandu","AWS",LocalDate.now().plusMonths(3),false));
		todos.add(new Todo(++todoCount,"chandu","JAVA",LocalDate.now().plusMonths(8),false));
		todos.add(new Todo(++todoCount,"chandu","Docker",LocalDate.now().plusMonths(6),false));
		todos.add(new Todo(++todoCount,"chandu","Spring",LocalDate.now().plusMonths(4),false));
 
	}
	
	public List<Todo> GetbyUsernames(String username)
	{
		return todos;
	}
	
	public  List<Todo> removeTodo(int id)
	{
		 return (List<Todo>) todos.remove(id-1);
	}
	
	public void addTodo(String username, String description, LocalDate targetdate, boolean status)
	{
		Todo todo = new Todo(++todoCount,username,description,targetdate,status);
		todos.add(todo); 
	}

}
