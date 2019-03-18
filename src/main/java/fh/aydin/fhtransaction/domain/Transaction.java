package fh.aydin.fhtransaction.domain;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "merchantId")
    private Integer merchantId;
    
    @Column(name = "acquirerId")
    private Integer acquirerId;
    
    @Column(name = "paymentMethod")
    private String paymentMethod;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "errorCode")
    private String errorCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getAcquirerId() {
		return acquirerId;
	}

	public void setAcquirerId(Integer acquirerId) {
		this.acquirerId = acquirerId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
  
}
