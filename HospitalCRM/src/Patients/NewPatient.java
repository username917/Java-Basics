package Patients;

public class NewPatient extends Patient {
	
	private double betterInsRate =0;
	private boolean afterHrsCare;
	public double getBetterInsRate() {
		return betterInsRate;
	}
	public void setBetterInsRate(double betterInsRate) {
		this.betterInsRate = betterInsRate;
	}
	public boolean isAfterHrsCare() {
		return afterHrsCare;
	}
	public void setAfterHrsCare(boolean afterHrsCare) {
		this.afterHrsCare = afterHrsCare;
	}
	public double getMedicineRate() {
		return medicineRate;
	}
	public void setMedicineRate(double medicineRate) {
		this.medicineRate = medicineRate;
	}
	private double medicineRate = 0;

}
