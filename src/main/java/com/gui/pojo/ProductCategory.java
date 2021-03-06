package com.gui.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProductCategory {
	private Integer id;

	private String name;

	private Integer sortOrder;

	private String image;

	private Date updateTime;

	private Integer updateUserId;

	private String description;

	private List<Product> productList;

	private String updateUserName;

	private String createTime;
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_category.id
	 * @return  the value of product_category.id
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_category.id
	 * @param id  the value for product_category.id
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_category.name
	 * @return  the value of product_category.name
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_category.name
	 * @param name  the value for product_category.name
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_category.sort_order
	 * @return  the value of product_category.sort_order
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public Integer getSortOrder() {
		return sortOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_category.sort_order
	 * @param sortOrder  the value for product_category.sort_order
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_category.image
	 * @return  the value of product_category.image
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public String getImage() {
		return image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_category.image
	 * @param image  the value for product_category.image
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_category.update_time
	 * @return  the value of product_category.update_time
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_category.update_time
	 * @param updateTime  the value for product_category.update_time
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_category.update_user_id
	 * @return  the value of product_category.update_user_id
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public Integer getUpdateUserId() {
		return updateUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_category.update_user_id
	 * @param updateUserId  the value for product_category.update_user_id
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_category.description
	 * @return  the value of product_category.description
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_category.description
	 * @param description  the value for product_category.description
	 * @mbg.generated  Fri Oct 21 16:26:56 CST 2016
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "ProductCategory{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sortOrder=" + sortOrder +
				", image='" + image + '\'' +
				", updateTime=" + updateTime +
				", updateUserId=" + updateUserId +
				", description='" + description + '\'' +
				", productList=" + productList +
				", updateUserName='" + updateUserName + '\'' +
				", createTime='" + createTime + '\'' +
				'}';
	}
}