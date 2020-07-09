package com.ruoyi.project.front.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.front.mapper.HxFormMapper;
import com.ruoyi.project.front.domain.HxForm;
import com.ruoyi.project.front.service.IHxFormService;

/**
 * 前台管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@Service
public class HxFormServiceImpl implements IHxFormService 
{
    @Autowired
    private HxFormMapper hxFormMapper;

    /**
     * 查询前台管理
     * 
     * @param id 前台管理ID
     * @return 前台管理
     */
    @Override
    public HxForm selectHxFormById(Long id)
    {
        return hxFormMapper.selectHxFormById(id);
    }

    /**
     * 查询前台管理列表
     * 
     * @param hxForm 前台管理
     * @return 前台管理
     */
    @Override
    public List<HxForm> selectHxFormList(HxForm hxForm)
    {
        return hxFormMapper.selectHxFormList(hxForm);
    }

    /**
     * 新增前台管理
     * 
     * @param hxForm 前台管理
     * @return 结果
     */
    @Override
    public int insertHxForm(HxForm hxForm)
    {
        hxForm.setCreateTime(DateUtils.getNowDate());
        return hxFormMapper.insertHxForm(hxForm);
    }

    /**
     * 修改前台管理
     * 
     * @param hxForm 前台管理
     * @return 结果
     */
    @Override
    public int updateHxForm(HxForm hxForm)
    {
        hxForm.setUpdateTime(DateUtils.getNowDate());
        return hxFormMapper.updateHxForm(hxForm);
    }

    /**
     * 批量删除前台管理
     * 
     * @param ids 需要删除的前台管理ID
     * @return 结果
     */
    @Override
    public int deleteHxFormByIds(Long[] ids)
    {
        return hxFormMapper.deleteHxFormByIds(ids);
    }

    /**
     * 删除前台管理信息
     * 
     * @param id 前台管理ID
     * @return 结果
     */
    @Override
    public int deleteHxFormById(Long id)
    {
        return hxFormMapper.deleteHxFormById(id);
    }
}
