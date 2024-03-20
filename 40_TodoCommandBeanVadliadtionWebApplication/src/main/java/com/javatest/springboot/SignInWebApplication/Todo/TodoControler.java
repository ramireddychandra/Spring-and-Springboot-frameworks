package com.javatest.springboot.SignInWebApplication.Todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")

public class TodoControler {
	
	private TodoServices todoServices;
	
	
	
	public TodoControler(TodoServices todoServices) {
		super();
		this.todoServices = todoServices;
	}

	


	@RequestMapping("list-todos")
	
	public String listofalltodos(ModelMap model) {
		List<Todo>todos = todoServices.GetbyUsernames("chandu");
		model.addAttribute("todos",todos);
		
		return "listOfTodos";
	} 
	 
@RequestMapping("delete-todo")
	
	public String deletetodo(@RequestParam int id,ModelMap model) {
		List<Todo>todos = todoServices.removeTodo(id);
		return "redirect:list-todos";
	} 
	 
	 
	@RequestMapping(value = "add-todo",method = RequestMethod.GET)
	public String AddTodo(ModelMap model)
	{
		String username = (String) model.get("name");
		Todo todo = new Todo(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("todo", todo);
		return "Addtodo";  
	} 
	
	@RequestMapping(value = "add-todo",method = RequestMethod.POST)
	public String RedirctTOTodo(ModelMap model,@Valid Todo todo, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "Addtodo";
		}
		todoServices.addTodo((String) model.get("name"), todo.getDescription(), LocalDate.now(), false);;
		return "redirect:list-todos";
	}

}
