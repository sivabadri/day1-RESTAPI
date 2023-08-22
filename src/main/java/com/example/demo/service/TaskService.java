package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Task;



public interface TaskService {

	public boolean addTask(Task task);
	public boolean updateTask(Long id  ,Task task);
	public List<Task> getTask();
}
