package main;

import java.time.LocalDate;

public class Order 
{
	private int id;
	private int clientId;
	private String wares;
	int weight;
	private LocalDate dateOfAcceptance;
	private ORDER_STATE orderState;
	private boolean acceptedOnWeldon;
	private boolean invoiced;
	private String notes;
	
	public Order(int id)
	{
		this.id = id;
		this.clientId = 0;
		this.wares = "";
		this.weight = 0;
		this.dateOfAcceptance = LocalDate.now();
		this.orderState = ORDER_STATE.FreshlyReceived;
		this.acceptedOnWeldon = false;
		this.invoiced = false;
	}
	public Order(int id, int clientId)
	{
		this(id);
		this.clientId = clientId;
	}
	public Order(int id, int clientId, String wares)
	{
		this(id, clientId);
		this.wares = wares;
	}
	public Order(int id, int clientId, String wares, int weight)
	{
		this(id, clientId, wares);
		this.weight = weight;
	}
	public Order(int id, int clientId, String wares, int weight, String notes)
	{
		this(id, clientId, wares, weight);
		this.notes = notes;
	}
	
	public int getId() {
		return id;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getWares() {
		return wares;
	}
	public void setWares(String wares) {
		this.wares = wares;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public LocalDate getDateOfAcceptance() {
		return dateOfAcceptance;
	}
	public void setDateOfAcceptance(LocalDate dateOfAcceptance) {
		this.dateOfAcceptance = dateOfAcceptance;
	}
	public ORDER_STATE getOrderState() {
		return orderState;
	}
	public void setOrderState(ORDER_STATE orderState) {
		this.orderState = orderState;
	}
	public boolean isAcceptedOnWeldon() {
		return acceptedOnWeldon;
	}
	public void setAcceptedOnWeldon(boolean acceptedOnWeldon) {
		this.acceptedOnWeldon = acceptedOnWeldon;
	}
	public boolean isInvoiced() {
		return invoiced;
	}
	public void setInvoiced(boolean invoiced) {
		this.invoiced = invoiced;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
