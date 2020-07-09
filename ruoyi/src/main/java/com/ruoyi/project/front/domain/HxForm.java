package com.ruoyi.project.front.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 前台管理对象 hx_form
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@Data
public class HxForm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** type */
    @Excel(name = "type")
    private String type;

    /** roomId */
    @Excel(name = "roomId")
    private Long roomId;

    /** hxUserId */
    @Excel(name = "hxUserId")
    private Long hxUserId;

    /** status */
    @Excel(name = "status")
    private Long status;

    /** action */
    @Excel(name = "action")
    private Long action;


}
