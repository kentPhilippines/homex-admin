package com.ruoyi.project.homex.domain;

import io.swagger.annotations.ApiModelProperty;
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
public class HxCondos extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty(value = "数据ID")
    private Long id;

    /**
     * condoName
     */
    @ApiModelProperty(value = "condoName公寓名")
    @Excel(name = "condoName")
    private String condoName;

    /**
     * tower
     */
    @ApiModelProperty(value = "tower")
    @Excel(name = "tower")
    private String tower;

    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    @Excel(name = "phone")
    private String phone;

    /**
     * email
     */
    @ApiModelProperty(value = "email")
    @Excel(name = "email")
    private String email;

    /**
     * password
     */
    @ApiModelProperty(value = "password")
    @Excel(name = "password")
    private String password;

    /**
     * $column.columnComment
     */
    @Excel(name = "about")
    @ApiModelProperty(value = "about")
    private String about;


}
