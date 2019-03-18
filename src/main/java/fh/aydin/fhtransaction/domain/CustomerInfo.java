package fh.aydin.fhtransaction.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "created_at", "updated_at", "deleted_at", "number", "expiryMonth", "expiryYear",
		"startMonth", "startYear", "issueNumber", "email", "birthday", "gender", "billingTitle", "Authorization" })
public class CustomerInfo {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("deleted_at")
	private String deletedAt;
	@JsonProperty("number")
	private String number;
	@JsonProperty("expiryMonth")
	private String expiryMonth;
	@JsonProperty("expiryYear")
	private String expiryYear;
	@JsonProperty("startMonth")
	private String startMonth;
	@JsonProperty("startYear")
	private Object startYear;
	@JsonProperty("issueNumber")
	private Object issueNumber;
	@JsonProperty("email")
	private String email;
	@JsonProperty("birthday")
	private String birthday;
	@JsonProperty("gender")
	private Object gender;
	@JsonProperty("billingTitle")
	private Object billingTitle;
	@JsonProperty("Authorization")
	private String authorization;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
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
	public Object getStartYear() {
		return startYear;
	}

	@JsonProperty("startYear")
	public void setStartYear(Object startYear) {
		this.startYear = startYear;
	}

	@JsonProperty("issueNumber")
	public Object getIssueNumber() {
		return issueNumber;
	}

	@JsonProperty("issueNumber")
	public void setIssueNumber(Object issueNumber) {
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
	public Object getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(Object gender) {
		this.gender = gender;
	}

	@JsonProperty("billingTitle")
	public Object getBillingTitle() {
		return billingTitle;
	}

	@JsonProperty("billingTitle")
	public void setBillingTitle(Object billingTitle) {
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

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}