package com.ruoyi.project.homex.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 公寓对象 hx_condos
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@Data
public class HxCondos extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** condoName */
    @Excel(name = "condoName")
    private String condoName;

    /** tower */
    @Excel(name = "tower")
    private String tower;

    /** phone */
    @Excel(name = "phone")
    private String phone;

    /** email */
    @Excel(name = "email")
    private String email;

    /** password */
    @Excel(name = "password")
    private String password;

    /** $column.columnComment */
    @Excel(name = "password")
    private String about;


}
