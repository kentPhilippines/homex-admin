package com.ruoyi.project.property.service;

import java.util.List;
import com.ruoyi.project.property.domain.HxPropertymanagement;

/**
 * 物业管理Service接口
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
public interface IHxPropertymanagementService 
{
    /**
     * 查询物业管理
     * 
     * @param id 物业管理ID
     * @return 物业管理
     */
    public HxPropertymanagement selectHxPropertymanagementById(Long id);

    /**
     * 查询物业管理列表
     * 
     * @param hxPropertymanagement 物业管理
     * @return 物业管理集合
     */
    public List<HxPropertymanagement> selectHxPropertymanagementList(HxPropertymanagement hxPropertymanagement);

    /**
     * 新增物业管理
     * 
     * @param hxPropertymanagement 物业管理
     * @return 结果
     */
    public int insertHxPropertymanagement(HxPropertymanagement hxPropertymanagement);

    /**
     * 修改物业管理
     * 
     * @param hxPropertymanagement 物业管理
     * @return 结果
     */
    public int updateHxPropertymanagement(HxPropertymanagement hxPropertymanagement);

    /**
     * 批量删除物业管理
     * 
     * @param ids 需要删除的物业管理ID
     * @return 结果
     */
    public int deleteHxPropertymanagementByIds(Long[] ids);

    /**
     * 删除物业管理信息
     * 
     * @param id 物业管理ID
     * @return 结果
     */
    public int deleteHxPropertymanagementById(Long id);
}
