package fh.aydin.fhtransaction.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "CUSTOMER")
@JsonPropertyOrder({ "id", "created_at", "updated_at", "deleted_at", "number", "expiryMonth", "expiryYear",
		"startMonth", "startYear", "issueNumber", "email", "birthday", "gender", "billingTitle", "Authorization" })
public class CustomerInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonProperty("id")
	private Long id;

	@JsonProperty("created_at")
	@Column(name = "customerInfocreated_at")
	private String createdAt;
	@JsonProperty("updated_at")
	@Column(name = "customerInfoupdated_at")
	private String updatedAt;
	@JsonProperty("deleted_at")
	@Column(name = "customerInfodeleted_at")
	private String deletedAt;
	@JsonProperty("number")
	@Column(name = "customerInfonumber")
	private String number;
	@JsonProperty("expiryMonth")
	@Column(name = "customerInfoexpiryMonth")
	private String expiryMonth;
	@JsonProperty("expiryYear")
	@Column(name = "customerInfoexpiryYear")
	private String expiryYear;
	@JsonProperty("startMonth")
	@Column(name = "customerInfostartMonth")
	private String startMonth;
	@JsonProperty("startYear")
	@Column(name = "customerInfostartYear")
	private String startYear;
	@JsonProperty("issueNumber")
	@Column(name = "customerInfoissueNumber")
	private String issueNumber;
	@JsonProperty("email")
	@Column(name = "customerInfoemail")
	private String email;
	@JsonProperty("birthday")
	@Column(name = "customerInfobirthday")
	private String birthday;
	@JsonProperty("gender")
	@Column(name = "customerInfogender")
	private String gender;
	@JsonProperty("billingTitle")
	@Column(name = "customerInfobillingTitle")
	private String billingTitle;
	@JsonProperty("Authorization")
	@Column(name = "customerInfoAuthorization")
	private String authorization;

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("deleted_at")
	public String getDeletedAt() {
		return deletedAt;
	}

	@JsonProperty("deleted_at")
	public void setDeletedAt(String deletedAt) {
		this.deletedAt = deletedAt;
	}

	@JsonProperty("number")
	public String getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(String number) {
		this.number = number;
	}

	@JsonProperty("expiryMonth")
	public String getExpiryMonth() {
		return expiryMonth;
	}

	@JsonProperty("expiryMonth")
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	@JsonProperty("expiryYear")
	public String getExpiryYear() {
		return expiryYear;
	}

	@JsonProperty("expiryYear")
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	@JsonProperty("startMonth")
	public String getStartMonth() {
		return startMonth;
	}

	@JsonProperty("startMonth")
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	@JsonProperty("startYear")
	public String getStartYear() {
		return startYear;
	}

	@JsonProperty("startYear")
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	@JsonProperty("issueNumber")
	public String getIssueNumber() {
		return issueNumber;
	}

	@JsonProperty("issueNumber")
	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("birthday")
	public String getBirthday() {
		return birthday;
	}

	@JsonProperty("birthday")
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("billingTitle")
	public String getBillingTitle() {
		return billingTitle;
	}

	@JsonProperty("billingTitle")
	public void setBillingTitle(String billingTitle) {
		this.billingTitle = billingTitle;
	}

	@JsonProperty("Authorization")
	public String getAuthorization() {
		return authorization;
	}

	@JsonProperty("Authorization")
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

}