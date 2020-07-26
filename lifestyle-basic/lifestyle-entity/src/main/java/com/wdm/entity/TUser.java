package com.wdm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description  
 * @Author  wdm
 * @Date 2020-07-26 16:23:23 
 */

@Entity
@Table ( name ="t_user" )
public class TUser implements Serializable {

	private static final long serialVersionUID =  6820107628743388399L;

	/**
	 * 用户id
	 */
   	@Column(name = "id" )
	private Long id;

	/**
	 * 账号
	 */
   	@Column(name = "account" )
	private String account;

	/**
	 * 密码
	 */
   	@Column(name = "pass_word" )
	private String passWord;

	/**
	 * 盐值
	 */
   	@Column(name = "salt" )
	private String salt;

	/**
	 * 用户昵称
	 */
   	@Column(name = "name" )
	private String name;

	/**
	 * 电话
	 */
   	@Column(name = "phone" )
	private String phone;

	/**
	 * 邮箱
	 */
   	@Column(name = "email" )
	private String email;

	/**
	 * 是否有效:
            0:无效
            1:有效
	 */
   	@Column(name = "is_valid" )
	private Integer isValid;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
}
