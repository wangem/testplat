package com.answern.testplat.demo.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @see 这个类是外部传值使用
 * @author wem
 *
 */
@ApiModel(value="person modol ")
@Data 
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "关键字")
	private String id;
	@ApiModelProperty(value = "名称"  )
	private String name;
	@ApiModelProperty(value = "年龄" )
	private String age;
	
 
 
}
