package com.example.election;

import java.util.ArrayList;
import java.util.List;

public class createElection {
    private List<Election> electionRecords;

    private static createElection crt = null;

    private createElection(){

    electionRecords = new ArrayList<Election>();

    }

    public static createElection getInstance() {

        if(crt == null) {

              crt = new createElection();

              return crt;

            }

            else {

                return crt;

            }

    }

    public void add(Election election) {

    	electionRecords.add(election);

    }
    public List<Election> getElectionRecords() {
    	return electionRecords;

    }

}
