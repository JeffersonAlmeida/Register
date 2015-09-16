package com.hanzo.register.model;

import java.util.List;

public class Field {

    private long id;
	private String name;
	private String jsonName;
	private String type;
	private String validation;
	private boolean mandatory;
	private boolean isJsonData;
	private int maxSize;
	private int minSize;
	private boolean editProfile;
	private String mask;
	private List<String> combo;
	
	private long getId() {
		return id;
	}
	private void setId(long id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getJsonName() {
		return jsonName;
	}
	private void setJsonName(String jsonName) {
		this.jsonName = jsonName;
	}
	private String getType() {
		return type;
	}
	private void setType(String type) {
		this.type = type;
	}
	private String getValidation() {
		return validation;
	}
	private void setValidation(String validation) {
		this.validation = validation;
	}
	private boolean isMandatory() {
		return mandatory;
	}
	private void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	private boolean isJsonData() {
		return isJsonData;
	}
	private void setJsonData(boolean isJsonData) {
		this.isJsonData = isJsonData;
	}
	private int getMaxSize() {
		return maxSize;
	}
	private void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	private int getMinSize() {
		return minSize;
	}
	private void setMinSize(int minSize) {
		this.minSize = minSize;
	}
	private boolean isEditProfile() {
		return editProfile;
	}
	private void setEditProfile(boolean editProfile) {
		this.editProfile = editProfile;
	}
	private String getMask() {
		return mask;
	}
	private void setMask(String mask) {
		this.mask = mask;
	}
	private List<String> getCombo() {
		return combo;
	}
	private void setCombo(List<String> combo) {
		this.combo = combo;
	}
	@Override
	public String toString() {
		return "Field [id=" + id + ", name=" + name + ", jsonName=" + jsonName
				+ ", type=" + type + ", validation=" + validation
				+ ", mandatory=" + mandatory + ", isJsonData=" + isJsonData
				+ ", maxSize=" + maxSize + ", minSize=" + minSize
				+ ", editProfile=" + editProfile + ", mask=" + mask
				+ ", combo=" + combo + "]";
	}
}
