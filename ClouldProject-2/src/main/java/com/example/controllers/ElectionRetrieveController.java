package com.example.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import com.example.election.*;

@Controller

public class ElectionRetrieveController{
	@RequestMapping(method=RequestMethod.GET, value="/Election/allElection")
	
	@ResponseBody
	public List<Election> getAllElection(){
		System.out.println("In Get Method");
		return createElection.getInstance().getElectionRecords();
	}	
}