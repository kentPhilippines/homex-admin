package com.ruoyi.project.ower.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.ower.mapper.HxRoomsMapper;
import com.ruoyi.project.ower.domain.HxRooms;
import com.ruoyi.project.ower.service.IHxRoomsService;

/**
 * 房间信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@Service
public class HxRoomsServiceImpl implements IHxRoomsService 
{
    @Autowired
    private HxRoomsMapper hxRoomsMapper;

    /**
     * 查询房间信息
     * 
     * @param id 房间信息ID
     * @return 房间信息
     */
    @Override
    public HxRooms selectHxRoomsById(Long id)
    {
        return hxRoomsMapper.selectHxRoomsById(id);
    }

    /**
     * 查询房间信息列表
     * 
     * @param hxRooms 房间信息
     * @return 房间信息
     */
    @Override
    public List<HxRooms> selectHxRoomsList(HxRooms hxRooms)
    {
        return hxRoomsMapper.selectHxRoomsList(hxRooms);
    }

    /**
     * 新增房间信息
     * 
     * @param hxRooms 房间信息
     * @return 结果
     */
    @Override
    public int insertHxRooms(HxRooms hxRooms)
    {
        hxRooms.setCreateTime(DateUtils.getNowDate());
        return hxRoomsMapper.insertHxRooms(hxRooms);
    }

    /**
     * 修改房间信息
     * 
     * @param hxRooms 房间信息
     * @return 结果
     */
    @Override
    public int updateHxRooms(HxRooms hxRooms)
    {
        hxRooms.setUpdateTime(DateUtils.getNowDate());
        return hxRoomsMapper.updateHxRooms(hxRooms);
    }

    /**
     * 批量删除房间信息
     * 
     * @param ids 需要删除的房间信息ID
     * @return 结果
     */
    @Override
    public int deleteHxRoomsByIds(Long[] ids)
    {
        return hxRoomsMapper.deleteHxRoomsByIds(ids);
    }

    /**
     * 删除房间信息信息
     * 
     * @param id 房间信息ID
     * @return 结果
     */
    @Override
    public int deleteHxRoomsById(Long id)
    {
        return hxRoomsMapper.deleteHxRoomsById(id);
    }
}
