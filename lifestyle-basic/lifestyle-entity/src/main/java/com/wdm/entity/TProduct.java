package com.wdm.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2020-07-15 
 */


@Entity
@Table ( name ="t_product" )
public class TProduct  implements Serializable {

	private static final long serialVersionUID =  2521853997519149508L;

   	@Column(name = "id" )
	private Long id;

	/**
	 * 商品名称
	 */
   	@Column(name = "name" )
	private String name;

	/**
	 * 价格
	 */
   	@Column(name = "price" )
	private Long price;

	/**
	 * 折扣价
	 */
   	@Column(name = "sale_price" )
	private Long salePrice;

	/**
	 * 卖点
	 */
   	@Column(name = "sale_point" )
	private String salePoint;

	/**
	 * 图片
	 */
   	@Column(name = "image" )
	private String image;

	/**
	 * 库存
	 */
   	@Column(name = "stock" )
	private Long stock;

	/**
	 * 标识
	 */
   	@Column(name = "flag" )
	private Integer flag;

	/**
	 * 创建时间
	 */
   	@Column(name = "create_time" )
	private Date createTime;

	/**
	 * 更新时间
	 */
   	@Column(name = "update_time" )
	private Date updateTime;

	/**
	 * 创建人
	 */
   	@Column(name = "create_user" )
	private Long createUser;

	/**
	 * 修改人
	 */
   	@Column(name = "update_user" )
	private Long updateUser;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getSalePoint() {
		return salePoint;
	}

	public void setSalePoint(String salePoint) {
		this.salePoint = salePoint;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}
}
