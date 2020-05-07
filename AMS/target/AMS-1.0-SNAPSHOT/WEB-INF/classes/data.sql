INSERT INTO AMS_USER_LOGIN
(USER_NAME, USER_PASSWORD, USER_PAN_CARD)
VALUES
('Abhijeet','abc','ANWPM9156C'),
('Admin','admin','ANWPM9156C'),
('Amit','aaa','A001');

INSERT INTO AMS_ENTITLEMENT
(USER_ID,ENTITLEMENT_TYPE)
VALUES
(1,'adminstration'),
(1, 'userRole'),
(1,'transactionRole'),
(2,'userRole'),
(2, 'transactionRole'),
(3,'userRole'),
(3, 'transactionRole');
