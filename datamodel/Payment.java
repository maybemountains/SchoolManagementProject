package datamodel;

import java.util.Date;

public class Payment {
	private int paymentID;
	private float payment;
	private Date date;
	
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	
	public float getPayment() {
		return payment;
	}
	public void setPayment(float payment) {
		this.payment = payment;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Payment [paymentID=" + paymentID + ", payment=" + payment + ", date=" + date + "]";
	}
	
}
