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
@Table ( name ="t_product_desc" )
public class TProductDesc implements Serializable {

	private static final long serialVersionUID =  7807955783052564564L;

   	@Column(name = "id" )
	private Long id;

	/**
	 * 商品描述
	 */
   	@Column(name = "p_desc" )
	private String pDesc;

	/**
	 * 商品id
	 */
   	@Column(name = "product_id" )
	private Long productId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
}
