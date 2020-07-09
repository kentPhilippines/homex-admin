package com.ruoyi.project.property.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.property.mapper.HxPropertymanagementMapper;
import com.ruoyi.project.property.domain.HxPropertymanagement;
import com.ruoyi.project.property.service.IHxPropertymanagementService;

/**
 * 物业管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@Service
public class HxPropertymanagementServiceImpl implements IHxPropertymanagementService 
{
    @Autowired
    private HxPropertymanagementMapper hxPropertymanagementMapper;

    /**
     * 查询物业管理
     * 
     * @param id 物业管理ID
     * @return 物业管理
     */
    @Override
    public HxPropertymanagement selectHxPropertymanagementById(Long id)
    {
        return hxPropertymanagementMapper.selectHxPropertymanagementById(id);
    }

    /**
     * 查询物业管理列表
     * 
     * @param hxPropertymanagement 物业管理
     * @return 物业管理
     */
    @Override
    public List<HxPropertymanagement> selectHxPropertymanagementList(HxPropertymanagement hxPropertymanagement)
    {
        return hxPropertymanagementMapper.selectHxPropertymanagementList(hxPropertymanagement);
    }

    /**
     * 新增物业管理
     * 
     * @param hxPropertymanagement 物业管理
     * @return 结果
     */
    @Override
    public int insertHxPropertymanagement(HxPropertymanagement hxPropertymanagement)
    {
        hxPropertymanagement.setCreateTime(DateUtils.getNowDate());
        return hxPropertymanagementMapper.insertHxPropertymanagement(hxPropertymanagement);
    }

    /**
     * 修改物业管理
     * 
     * @param hxPropertymanagement 物业管理
     * @return 结果
     */
    @Override
    public int updateHxPropertymanagement(HxPropertymanagement hxPropertymanagement)
    {
        hxPropertymanagement.setUpdateTime(DateUtils.getNowDate());
        return hxPropertymanagementMapper.updateHxPropertymanagement(hxPropertymanagement);
    }

    /**
     * 批量删除物业管理
     * 
     * @param ids 需要删除的物业管理ID
     * @return 结果
     */
    @Override
    public int deleteHxPropertymanagementByIds(Long[] ids)
    {
        return hxPropertymanagementMapper.deleteHxPropertymanagementByIds(ids);
    }

    /**
     * 删除物业管理信息
     * 
     * @param id 物业管理ID
     * @return 结果
     */
    @Override
    public int deleteHxPropertymanagementById(Long id)
    {
        return hxPropertymanagementMapper.deleteHxPropertymanagementById(id);
    }
}
