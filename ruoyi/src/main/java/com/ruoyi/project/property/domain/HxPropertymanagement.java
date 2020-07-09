package com.ruoyi.project.property.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 物业管理对象 hx_propertymanagement
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@Data
public class HxPropertymanagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** tower */
    @Excel(name = "tower")
    private String tower;

    /** condoId */
    @Excel(name = "condoId")
    private Long condoId;

    /** name */
    @Excel(name = "name")
    private String name;

    /** phone */
    @Excel(name = "phone")
    private String phone;

    /** type */
    @Excel(name = "type")
    private Long type;


}
