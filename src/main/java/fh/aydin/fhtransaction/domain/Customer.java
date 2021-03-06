package fh.aydin.fhtransaction.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "CUSTOMER")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "customerInfo", "billingFirstName", "billingLastName", "billingCompany", "billingAddress1",
		"billingAddress2", "billingCity", "billingPostcode", "billingState", "billingCountry", "billingPhone",
		"billingFax", "shippingTitle", "shippingFirstName", "shippingLastName", "shippingCompany", "shippingAddress1",
		"shippingAddress2", "shippingCity", "shippingPostcode", "shippingState", "shippingCountry", "shippingPhone",
		"shippingFax" })
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@JsonProperty("customerInfo")
	@OneToOne(fetch = FetchType.EAGER, targetEntity = CustomerInfo.class)
	private CustomerInfo customerInfo;
	
	@JsonProperty("billingFirstName")
	private String billingFirstName;
	@JsonProperty("billingLastName")
	private String billingLastName;
	@JsonProperty("billingCompany")
	private String billingCompany;
	@JsonProperty("billingAddress1")
	private String billingAddress1;
	@JsonProperty("billingAddress2")
	private String billingAddress2;
	@JsonProperty("billingCity")
	private String billingCity;
	@JsonProperty("billingPostcode")
	private String billingPostcode;
	@JsonProperty("billingState")
	private String billingState;
	@JsonProperty("billingCountry")
	private String billingCountry;
	@JsonProperty("billingPhone")
	private String billingPhone;
	@JsonProperty("billingFax")
	private String billingFax;
	@JsonProperty("shippingTitle")
	private String shippingTitle;
	@JsonProperty("shippingFirstName")
	private String shippingFirstName;
	@JsonProperty("shippingLastName")
	private String shippingLastName;
	@JsonProperty("shippingCompany")
	private String shippingCompany;
	@JsonProperty("shippingAddress1")
	private String shippingAddress1;
	@JsonProperty("shippingAddress2")
	private String shippingAddress2;
	@JsonProperty("shippingCity")
	private String shippingCity;
	@JsonProperty("shippingPostcode")
	private String shippingPostcode;
	@JsonProperty("shippingState")
	private String shippingState;
	@JsonProperty("shippingCountry")
	private String shippingCountry;
	@JsonProperty("shippingPhone")
	private String shippingPhone;
	@JsonProperty("shippingFax")
	private String shippingFax;

	@JsonProperty("customerInfo")
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	@JsonProperty("customerInfo")
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	@JsonProperty("billingFirstName")
	public String getBillingFirstName() {
		return billingFirstName;
	}

	@JsonProperty("billingFirstName")
	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}

	@JsonProperty("billingLastName")
	public String getBillingLastName() {
		return billingLastName;
	}

	@JsonProperty("billingLastName")
	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}

	@JsonProperty("billingCompany")
	public String getBillingCompany() {
		return billingCompany;
	}

	@JsonProperty("billingCompany")
	public void setBillingCompany(String billingCompany) {
		this.billingCompany = billingCompany;
	}

	@JsonProperty("billingAddress1")
	public String getBillingAddress1() {
		return billingAddress1;
	}

	@JsonProperty("billingAddress1")
	public void setBillingAddress1(String billingAddress1) {
		this.billingAddress1 = billingAddress1;
	}

	@JsonProperty("billingAddress2")
	public String getBillingAddress2() {
		return billingAddress2;
	}

	@JsonProperty("billingAddress2")
	public void setBillingAddress2(String billingAddress2) {
		this.billingAddress2 = billingAddress2;
	}

	@JsonProperty("billingCity")
	public String getBillingCity() {
		return billingCity;
	}

	@JsonProperty("billingCity")
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	@JsonProperty("billingPostcode")
	public String getBillingPostcode() {
		return billingPostcode;
	}

	@JsonProperty("billingPostcode")
	public void setBillingPostcode(String billingPostcode) {
		this.billingPostcode = billingPostcode;
	}

	@JsonProperty("billingState")
	public String getBillingState() {
		return billingState;
	}

	@JsonProperty("billingState")
	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	@JsonProperty("billingCountry")
	public String getBillingCountry() {
		return billingCountry;
	}

	@JsonProperty("billingCountry")
	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}

	@JsonProperty("billingPhone")
	public String getBillingPhone() {
		return billingPhone;
	}

	@JsonProperty("billingPhone")
	public void setBillingPhone(String billingPhone) {
		this.billingPhone = billingPhone;
	}

	@JsonProperty("billingFax")
	public String getBillingFax() {
		return billingFax;
	}

	@JsonProperty("billingFax")
	public void setBillingFax(String billingFax) {
		this.billingFax = billingFax;
	}

	@JsonProperty("shippingTitle")
	public String getShippingTitle() {
		return shippingTitle;
	}

	@JsonProperty("shippingTitle")
	public void setShippingTitle(String shippingTitle) {
		this.shippingTitle = shippingTitle;
	}

	@JsonProperty("shippingFirstName")
	public String getShippingFirstName() {
		return shippingFirstName;
	}

	@JsonProperty("shippingFirstName")
	public void setShippingFirstName(String shippingFirstName) {
		this.shippingFirstName = shippingFirstName;
	}

	@JsonProperty("shippingLastName")
	public String getShippingLastName() {
		return shippingLastName;
	}

	@JsonProperty("shippingLastName")
	public void setShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
	}

	@JsonProperty("shippingCompany")
	public String getShippingCompany() {
		return shippingCompany;
	}

	@JsonProperty("shippingCompany")
	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	@JsonProperty("shippingAddress1")
	public String getShippingAddress1() {
		return shippingAddress1;
	}

	@JsonProperty("shippingAddress1")
	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}

	@JsonProperty("shippingAddress2")
	public String getShippingAddress2() {
		return shippingAddress2;
	}

	@JsonProperty("shippingAddress2")
	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	@JsonProperty("shippingCity")
	public String getShippingCity() {
		return shippingCity;
	}

	@JsonProperty("shippingCity")
	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	@JsonProperty("shippingPostcode")
	public String getShippingPostcode() {
		return shippingPostcode;
	}

	@JsonProperty("shippingPostcode")
	public void setShippingPostcode(String shippingPostcode) {
		this.shippingPostcode = shippingPostcode;
	}

	@JsonProperty("shippingState")
	public String getShippingState() {
		return shippingState;
	}

	@JsonProperty("shippingState")
	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	@JsonProperty("shippingCountry")
	public String getShippingCountry() {
		return shippingCountry;
	}

	@JsonProperty("shippingCountry")
	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	@JsonProperty("shippingPhone")
	public String getShippingPhone() {
		return shippingPhone;
	}

	@JsonProperty("shippingPhone")
	public void setShippingPhone(String shippingPhone) {
		this.shippingPhone = shippingPhone;
	}

	@JsonProperty("shippingFax")
	public String getShippingFax() {
		return shippingFax;
	}

	@JsonProperty("shippingFax")
	public void setShippingFax(String shippingFax) {
		this.shippingFax = shippingFax;
	}

}
