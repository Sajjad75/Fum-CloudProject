package com.example.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.election.*;

@Controller
public class ElectionRegistrationController {
	@RequestMapping(method = RequestMethod.POST, value="/register/election")
	
	@ResponseBody
	public ElectionRegistrationReply registerElection(@RequestBody Election election) {
		System.out.println("In Register Election");
		ElectionRegistrationReply eleRegRlp=new ElectionRegistrationReply();
		createElection.getInstance().add(election);
		eleRegRlp.setId(election.getId());
		eleRegRlp.setStartTime(election.getStartTime());
		eleRegRlp.setEndTime(election.getEndTime());
		eleRegRlp.setListOfChoice(election.getListOfChoice());
		eleRegRlp.setNumberOfVotes(election.getNumberOfVotes());
		eleRegRlp.setElectionStatus("Successful");
		
		return eleRegRlp;
	}
	

}
