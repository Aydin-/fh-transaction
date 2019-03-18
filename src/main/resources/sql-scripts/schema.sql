CREATE TABLE TRANSACTION (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  merchantId Int,
  acquirerId Int,
  paymentMethod varchar(32),
  status varchar(64),
  errorCode varchar(64),
  PRIMARY KEY (id)
);

CREATE TABLE USER (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  password varchar(255) NOT NULL,
  username varchar(255) NOT NULL,
  PRIMARY KEY (id)
);
