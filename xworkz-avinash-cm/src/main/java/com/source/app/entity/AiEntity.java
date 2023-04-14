package com.source.app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ai_table")
@NamedQuery(name = "find",query = "select ent from AiEntity ent")
@NamedQuery(name = "userId",query = "select count(*) from  AiEntity ent where ent.userId=:userBy")
@NamedQuery(name = "emailId",query = "select count(*) from  AiEntity ent where ent.email=:emailBy")
@NamedQuery(name = "mobileId",query = "select count(*) from  AiEntity ent where ent.num=:mobileBy")
//@NamedQuery(name = "userIdAndPassword",query = "select entity from AiEntity entity where entity.userId=:userBy and entity.password=:passwordBy")
@NamedQuery(name = "findByUserId",query = "select entity from AiEntity entity where entity.userId=:user")
@NamedQuery(name="updateLoginCount",query="update AiEntity entity set entity.loginCount=:count where entity.userId=:user")
//@NamedQuery(name = "findByEmails",query="Select entity from AiEntity entity where entity.email = ?1")
@NamedQuery(name = "changepassword",query = "update AiEntity entity set entity.password=:pass,entity.confirmPassword=:conf where entity.userId=:uu")
@NamedQuery(name = "email",query = "select entity from  AiEntity entity where entity.email=:email")
public class AiEntity {

	@Id
	@Column(name = "ai_signUpId")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int signUpId;
	@Column(name = "ai_userId")
	private String userId;
	@Column(name = "ai_email")
	private String email;
	@Column(name = "ai_number")
	private long num;
	@Column(name = "ai_password")
	private String password;
	@Column(name = "ai_confirmPassword")
	private String confirmPassword;
	@Column(name = "ai_createdBy")
	private String createdBy;
	@Column(name = "ai_createdDate")
	private LocalDateTime createdDate;
	@Column(name = "ai_updatedBy")
	private String updatedBy;
	@Column(name = "ai_updatedDate")
	private LocalDateTime updatedDate;
	@Column(name = "ai_loginCount")
	private int loginCount;
	@Column(name = "reset_password_token")
	private String resetPasswordToken;
	                                     
	
}
