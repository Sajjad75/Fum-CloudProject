package com.example.election;

import java.util.Date;
import java.util.List;

public class ElectionRegistrationReply {
	int Id;
	Date startTime;
	Date endTime;
	List<String> listOfChoice;
	int numberOfVotes;
	String ElectionStatus;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public List<String> getListOfChoice() {
		return listOfChoice;
	}
	public void setListOfChoice(List<String> listOfChoice) {
		this.listOfChoice = listOfChoice;
	}
	public int getNumberOfVotes() {
		return numberOfVotes;
	}
	public void setNumberOfVotes(int numberOfVotes) {
		this.numberOfVotes = numberOfVotes;
	}
	public String getElectionStatus() {
		return ElectionStatus;
	}
	public void setElectionStatus(String electionStatus) {
		ElectionStatus = electionStatus;
	}
	

}
