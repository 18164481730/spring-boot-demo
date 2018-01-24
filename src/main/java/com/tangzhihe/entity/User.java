package com.tangzhihe.entity;

/**
 * 用户基础类
 * @author Administrator
 *
 */
public class User {
	//主键
	private Integer id;
	//用户姓名
	private String userName;
	//密码
	private String password;
	//用户角色
	private String roleName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", roleName=" + roleName + "]";
	}
}






















