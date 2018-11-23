package fr.formation.partiel1;

import java.util.Date;

public class Virement {
	
	int amount;
	Date date;


	Date dateExecution;
	
	public Virement(int amount, Date date, Date dateExecution) {
		this.amount = amount;
		this.date = date;
		this.dateExecution = dateExecution;			
	}	
	
	public int getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	}

	public Date getDateExecution() {
		return dateExecution;
	}
}
