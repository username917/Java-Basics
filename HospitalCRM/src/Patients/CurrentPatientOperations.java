package Patients;

import java.util.Date;

public class CurrentPatientOperations extends CurrentPatient {
	
	private String diagnostic;
	private String prescription;
	private Date followUp;
	
	public String updateDiagnose() {
		
		String disagnose = null;
		
		return disagnose;
	}
	
	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public Date getFollowUp() {
		return followUp;
	}

	public void setFollowUp(Date followUp) {
		this.followUp = followUp;
	}

	public void pickUpPrescription() {
		
	}
	
	public void bookFollowUp() {
		
	}
	
	public void updateRecord() {
		
	}
	
	public void sendUpdateToDoctor() {
		
	}
	

	@Override
	public void getService() {
		// TODO Auto-generated method stub
		
	}

}
