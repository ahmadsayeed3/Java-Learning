package com.finder.dto;

public class Product {

	private int id;
	private String name;
	private double payout;
	private String type;
	private String category;
	private String updated;
	private String description;
	private String contries;
	private String networkName;
	private String networkDescription;
	private String networkLogo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPayout() {
		return payout;
	}

	public void setPayout(double payout) {
		this.payout = payout;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContries() {
		return contries;
	}

	public void setContries(String contries) {
		this.contries = contries;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public String getNetworkDescription() {
		return networkDescription;
	}

	public void setNetworkDescription(String networkDescription) {
		this.networkDescription = networkDescription;
	}

	public String getNetworkLogo() {
		return networkLogo;
	}

	public void setNetworkLogo(String networkLogo) {
		this.networkLogo = networkLogo;
	}
}
