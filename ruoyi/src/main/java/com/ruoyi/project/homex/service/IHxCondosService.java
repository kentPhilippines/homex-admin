package com.ruoyi.project.homex.service;

import java.util.List;
import com.ruoyi.project.homex.domain.HxCondos;

/**
 * 公寓Service接口
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
public interface IHxCondosService 
{
    /**
     * 查询公寓
     * 
     * @param id 公寓ID
     * @return 公寓
     */
    public HxCondos selectHxCondosById(Long id);

    /**
     * 查询公寓列表
     * 
     * @param hxCondos 公寓
     * @return 公寓集合
     */
    public List<HxCondos> selectHxCondosList(HxCondos hxCondos);

    /**
     * 新增公寓
     * 
     * @param hxCondos 公寓
     * @return 结果
     */
    public int insertHxCondos(HxCondos hxCondos);

    /**
     * 修改公寓
     * 
     * @param hxCondos 公寓
     * @return 结果
     */
    public int updateHxCondos(HxCondos hxCondos);

    /**
     * 批量删除公寓
     * 
     * @param ids 需要删除的公寓ID
     * @return 结果
     */
    public int deleteHxCondosByIds(Long[] ids);

    /**
     * 删除公寓信息
     * 
     * @param id 公寓ID
     * @return 结果
     */
    public int deleteHxCondosById(Long id);
}
