package com.fatou.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;
	
	static {
		todos.add(new Todo(1, "sheet", "milkbody",new Date(),
				false));
		todos.add(new Todo(2,"sheet","clothes",new Date(),false));
		todos.add(new Todo(3,"sheet","sleeve",new Date(),
				false));
	}


}
