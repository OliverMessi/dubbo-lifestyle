package com.wdm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * @Description  
 * @Author  Wdm
 * @Date 2020-07-15 
 */


@Entity
@Table ( name ="t_product_type" )
public class TProductType implements Serializable {

	private static final long serialVersionUID =  7241528452608917912L;

   	@Column(name = "id" )
	private Long id;

	/**
	 * 商品id
	 */
   	@Column(name = "product_id" )
	private String productId;

	/**
	 * 类别名称
	 */
   	@Column(name = "name" )
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
