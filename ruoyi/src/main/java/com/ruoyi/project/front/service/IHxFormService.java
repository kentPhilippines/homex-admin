package com.ruoyi.project.front.service;

import java.util.List;
import com.ruoyi.project.front.domain.HxForm;

/**
 * 前台管理Service接口
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
public interface IHxFormService 
{
    /**
     * 查询前台管理
     * 
     * @param id 前台管理ID
     * @return 前台管理
     */
    public HxForm selectHxFormById(Long id);

    /**
     * 查询前台管理列表
     * 
     * @param hxForm 前台管理
     * @return 前台管理集合
     */
    public List<HxForm> selectHxFormList(HxForm hxForm);

    /**
     * 新增前台管理
     * 
     * @param hxForm 前台管理
     * @return 结果
     */
    public int insertHxForm(HxForm hxForm);

    /**
     * 修改前台管理
     * 
     * @param hxForm 前台管理
     * @return 结果
     */
    public int updateHxForm(HxForm hxForm);

    /**
     * 批量删除前台管理
     * 
     * @param ids 需要删除的前台管理ID
     * @return 结果
     */
    public int deleteHxFormByIds(Long[] ids);

    /**
     * 删除前台管理信息
     * 
     * @param id 前台管理ID
     * @return 结果
     */
    public int deleteHxFormById(Long id);
}
