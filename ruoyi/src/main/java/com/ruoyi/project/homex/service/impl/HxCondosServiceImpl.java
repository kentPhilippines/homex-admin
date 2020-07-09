package com.ruoyi.project.homex.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.homex.mapper.HxCondosMapper;
import com.ruoyi.project.homex.domain.HxCondos;
import com.ruoyi.project.homex.service.IHxCondosService;

/**
 * 公寓Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@Service
public class HxCondosServiceImpl implements IHxCondosService 
{
    @Autowired
    private HxCondosMapper hxCondosMapper;

    /**
     * 查询公寓
     * 
     * @param id 公寓ID
     * @return 公寓
     */
    @Override
    public HxCondos selectHxCondosById(Long id)
    {
        return hxCondosMapper.selectHxCondosById(id);
    }

    /**
     * 查询公寓列表
     * 
     * @param hxCondos 公寓
     * @return 公寓
     */
    @Override
    public List<HxCondos> selectHxCondosList(HxCondos hxCondos)
    {
        return hxCondosMapper.selectHxCondosList(hxCondos);
    }

    /**
     * 新增公寓
     * 
     * @param hxCondos 公寓
     * @return 结果
     */
    @Override
    public int insertHxCondos(HxCondos hxCondos)
    {
        hxCondos.setCreateTime(DateUtils.getNowDate());
        return hxCondosMapper.insertHxCondos(hxCondos);
    }

    /**
     * 修改公寓
     * 
     * @param hxCondos 公寓
     * @return 结果
     */
    @Override
    public int updateHxCondos(HxCondos hxCondos)
    {
        hxCondos.setUpdateTime(DateUtils.getNowDate());
        return hxCondosMapper.updateHxCondos(hxCondos);
    }

    /**
     * 批量删除公寓
     * 
     * @param ids 需要删除的公寓ID
     * @return 结果
     */
    @Override
    public int deleteHxCondosByIds(Long[] ids)
    {
        return hxCondosMapper.deleteHxCondosByIds(ids);
    }

    /**
     * 删除公寓信息
     * 
     * @param id 公寓ID
     * @return 结果
     */
    @Override
    public int deleteHxCondosById(Long id)
    {
        return hxCondosMapper.deleteHxCondosById(id);
    }
}
