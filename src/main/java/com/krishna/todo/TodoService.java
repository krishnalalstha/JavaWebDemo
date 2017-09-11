package com.krishna.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();

	static {
		todos.add(new Todo("Learn Web Application", "Java Web"));
		todos.add(new Todo("Learn Spring", "Java"));
		todos.add(new Todo("Learn Spring MVC", "Java"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(String todo, String categoty) {
		todos.remove(new Todo(todo, categoty));
	}
}
