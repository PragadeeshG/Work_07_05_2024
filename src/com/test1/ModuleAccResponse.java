package com.test1;

public class ModuleAccResponse {
	private Integer moduleAccId;
	private String moduleAccOwner;
	private boolean activemoduleAcc;
	private Integer moduleAccTypeId;
	private String moduleAccType;
	private String moduleAccStatus;
	private Integer moduleAccDescription;
	private Integer userGroupsCount;
	private String userCountries;
	private Integer userCountriesCount;
	private String userGroups;
	private String status;
	private String remarks;

	public ModuleAccResponse() {

	}

	public ModuleAccResponse(Integer moduleAccId, String moduleAccOwner, boolean activemoduleAcc,
			Integer moduleAccTypeId, String moduleAccType, String moduleAccStatus, Integer moduleAccDescription,
			Integer userGroupsCount, String userCountries, Integer userCountriesCount, String userGroups, String status,
			String remarks) {
		super();
		this.moduleAccId = moduleAccId;
		this.moduleAccOwner = moduleAccOwner;
		this.activemoduleAcc = activemoduleAcc;
		this.moduleAccTypeId = moduleAccTypeId;
		this.moduleAccType = moduleAccType;
		this.moduleAccStatus = moduleAccStatus;
		this.moduleAccDescription = moduleAccDescription;
		this.userGroupsCount = userGroupsCount;
		this.userCountries = userCountries;
		this.userCountriesCount = userCountriesCount;
		this.userGroups = userGroups;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getModuleAccId() {
		return moduleAccId;
	}

	public void setModuleAccId(Integer moduleAccId) {
		this.moduleAccId = moduleAccId;
	}

	public String getModuleAccOwner() {
		return moduleAccOwner;
	}

	public void setModuleAccOwner(String moduleAccOwner) {
		this.moduleAccOwner = moduleAccOwner;
	}

	public boolean isActivemoduleAcc() {
		return activemoduleAcc;
	}

	public void setActivemoduleAcc(boolean activemoduleAcc) {
		this.activemoduleAcc = activemoduleAcc;
	}

	public Integer getModuleAccTypeId() {
		return moduleAccTypeId;
	}

	public void setModuleAccTypeId(Integer moduleAccTypeId) {
		this.moduleAccTypeId = moduleAccTypeId;
	}

	public String getModuleAccType() {
		return moduleAccType;
	}

	public void setModuleAccType(String moduleAccType) {
		this.moduleAccType = moduleAccType;
	}

	public String getModuleAccStatus() {
		return moduleAccStatus;
	}

	public void setModuleAccStatus(String moduleAccStatus) {
		this.moduleAccStatus = moduleAccStatus;
	}

	public Integer getModuleAccDescription() {
		return moduleAccDescription;
	}

	public void setModuleAccDescription(Integer moduleAccDescription) {
		this.moduleAccDescription = moduleAccDescription;
	}

	public Integer getUserGroupsCount() {
		return userGroupsCount;
	}

	public void setUserGroupsCount(Integer userGroupsCount) {
		this.userGroupsCount = userGroupsCount;
	}

	public String getUserCountries() {
		return userCountries;
	}

	public void setUserCountries(String userCountries) {
		this.userCountries = userCountries;
	}

	public Integer getUserCountriesCount() {
		return userCountriesCount;
	}

	public void setUserCountriesCount(Integer userCountriesCount) {
		this.userCountriesCount = userCountriesCount;
	}

	public String getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(String userGroups) {
		this.userGroups = userGroups;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
