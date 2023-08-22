package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/addTask")
	public ResponseEntity<String> addtask(@RequestBody Task task){
		boolean dataSaved = taskService.addTask(task);
		if(dataSaved) {
			return ResponseEntity.status(200).body("Task added successfully!");
			}
		else
		{
			return ResponseEntity.status(404).body("Something went wrong!");
		}
	}
	public ResponseEntity<String> updateTask(@PathVariable Long id,@RequestBody Task task){
		boolean taskData = taskService.updateTask(id,task);
		if(taskData) {
			return ResponseEntity.status(200).body("User updated successfully");
		}
		else {
			return ResponseEntity.status(404).body("No record found");
		}
	}

}
