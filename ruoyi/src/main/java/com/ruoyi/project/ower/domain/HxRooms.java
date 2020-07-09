package com.ruoyi.project.ower.domain;

import lombok.Data;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 房间信息对象 hx_rooms
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@Data
public class HxRooms extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** tower */
    @Excel(name = "tower")
    private String tower;

    /** unit */
    @Excel(name = "unit")
    private String unit;

    /** area */
    @Excel(name = "area")
    private Long area;

    /** type */
    @Excel(name = "type")
    private Long type;

    /** parking */
    @Excel(name = "parking")
    private String parking;

    /** condoId */
    @Excel(name = "condoId")
    private Long condoId;


}
