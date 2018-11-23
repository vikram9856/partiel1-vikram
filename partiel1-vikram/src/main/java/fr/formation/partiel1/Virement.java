package fr.formation.partiel1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Virement {

	float amount;
	LocalDateTime dateExecution;
	LocalDate date;

	public float getAmount() {
		return amount;
	}

	public LocalDateTime getDateExecution() {
		return dateExecution;
	}

	public LocalDate getDate() {
		return date;
	}

	public Virement(float amount, LocalDateTime dateExecution, LocalDate date) {
		this.amount = amount;
		this.date = date;
		this.dateExecution = dateExecution;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setDateExecution(LocalDateTime dateExecution) {
		this.dateExecution = dateExecution;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
