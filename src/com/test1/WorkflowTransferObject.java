package com.test1;

public class WorkflowTransferObject {
	private Integer flowCode;
	private String flowType;
	private String flowRefId;
	private String flowScreenId;
	private Integer orderedCrId;
	private Integer orderTypeCode;
	private Integer userId;
	private String keyAtttribute;
	private String orderDesc;
	private String ketAttrValue;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public WorkflowTransferObject() {

	}

	public WorkflowTransferObject(Integer flowCode, String flowType, String flowRefId, String flowScreenId,
			Integer orderedCrId, Integer orderTypeCode, Integer userId, String keyAtttribute, String orderDesc,
			String ketAttrValue, String creationDate, String modifiedDate, String entityState) {
		super();
		this.flowCode = flowCode;
		this.flowType = flowType;
		this.flowRefId = flowRefId;
		this.flowScreenId = flowScreenId;
		this.orderedCrId = orderedCrId;
		this.orderTypeCode = orderTypeCode;
		this.userId = userId;
		this.keyAtttribute = keyAtttribute;
		this.orderDesc = orderDesc;
		this.ketAttrValue = ketAttrValue;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getFlowCode() {
		return flowCode;
	}

	public void setFlowCode(Integer flowCode) {
		this.flowCode = flowCode;
	}

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public String getFlowRefId() {
		return flowRefId;
	}

	public void setFlowRefId(String flowRefId) {
		this.flowRefId = flowRefId;
	}

	public String getFlowScreenId() {
		return flowScreenId;
	}

	public void setFlowScreenId(String flowScreenId) {
		this.flowScreenId = flowScreenId;
	}

	public Integer getOrderedCrId() {
		return orderedCrId;
	}

	public void setOrderedCrId(Integer orderedCrId) {
		this.orderedCrId = orderedCrId;
	}

	public Integer getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(Integer orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getKeyAtttribute() {
		return keyAtttribute;
	}

	public void setKeyAtttribute(String keyAtttribute) {
		this.keyAtttribute = keyAtttribute;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public String getKetAttrValue() {
		return ketAttrValue;
	}

	public void setKetAttrValue(String ketAttrValue) {
		this.ketAttrValue = ketAttrValue;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
