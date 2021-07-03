--Author: Justin Wallace
--Date: 7/1/2021

--drop tables
DROP TABLE ers_reimbursement;
DROP TABLE ers_users;
DROP TABLE ers_user_roles;
DROP TABLE ers_reimbursement_type;
DROP TABLE ers_reimbursement_status;
DROP SCHEMA P1;

--Schema CREATE
CREATE SCHEMA P1;

--Set SCHEMA 
SET search_path TO P1;

CREATE TABLE ers_user_roles(
	ers_user_role_id INT PRIMARY KEY NOT NULL,
	user_role VARCHAR(10) NOT NULL
);

CREATE TABLE ers_reimbursement_type(
	reimb_type_id INT PRIMARY KEY NOT NULL,
	reimb_type VARCHAR(10) NOT NULL
);

CREATE TABLE ers_reimbursement_status(
	reimb_status_id INT PRIMARY KEY NOT NULL,
	reimb_status VARCHAR(10) NOT NULL
);

CREATE TABLE ers_users(
	ers_users_id INT PRIMARY KEY NOT NULL,
	ers_username VARCHAR(50) UNIQUE NOT NULL,
	ers_password VARCHAR(50) NOT NULL,
	user_first_name VARCHAR(100) NOT NULL,
	user_last_name VARCHAR(100) NOT NULL,
	user_email VARCHAR(150) UNIQUE NOT NULL,
	user_role_id INT NOT NULL,
	CONSTRAINT user_roles_fk FOREIGN KEY(user_role_id)
	REFERENCES ers_user_roles(ers_user_role_id)
);

CREATE TABLE ers_reimbursement(
	reimb_id INT PRIMARY KEY NOT NULL,
	reimb_amount INT NOT NULL,
	reimb_submitted TIMESTAMP NOT NULL,
	reimb_resolved TIMESTAMP,
	reimb_description VARCHAR(250),
	reimb_receipt BYTEA,
	reimb_author INT NOT NULL,
	reimb_resolver INT,
	reimb_status_id INT NOT NULL,
	reimb_type_id INT NOT NULL,
	CONSTRAINT ers_users_fk_auth FOREIGN KEY(reimb_author)
	REFERENCES ers_users(ers_users_id),
	CONSTRAINT ers_users_fk_reslvr FOREIGN KEY(reimb_resolver)
	REFERENCES ers_users(ers_users_id),
	CONSTRAINT ers_reimbursement_status_fk FOREIGN KEY(reimb_status_id)
	REFERENCES ers_reimbursement_status(reimb_status_id),
	CONSTRAINT ers_reimbursement_type_fk FOREIGN KEY(reimb_type_id)
	REFERENCES ers_reimbursement_type(reimb_type_id)
);