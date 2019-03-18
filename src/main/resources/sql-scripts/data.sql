
-- non-encrypted password: jwtpass
INSERT INTO USER (id, password, username) VALUES (1, '$2a$10$qtH0F1m488673KwgAfFXEOWxsoZSeHqqlB/8BTt3a6gsI5c2mdlfe', 'admin');

INSERT INTO TRANSACTION (id, merchantId, acquirerId,paymentMethod,status,errorCode) VALUES (1, 1, 2, 'CREDIT_CARD','COMPLETE','NONE');