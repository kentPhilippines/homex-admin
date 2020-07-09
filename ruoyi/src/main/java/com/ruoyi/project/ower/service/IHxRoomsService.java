package com.ruoyi.project.ower.service;

import java.util.List;
import com.ruoyi.project.ower.domain.HxRooms;

/**
 * 房间信息Service接口
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
public interface IHxRoomsService 
{
    /**
     * 查询房间信息
     * 
     * @param id 房间信息ID
     * @return 房间信息
     */
    public HxRooms selectHxRoomsById(Long id);

    /**
     * 查询房间信息列表
     * 
     * @param hxRooms 房间信息
     * @return 房间信息集合
     */
    public List<HxRooms> selectHxRoomsList(HxRooms hxRooms);

    /**
     * 新增房间信息
     * 
     * @param hxRooms 房间信息
     * @return 结果
     */
    public int insertHxRooms(HxRooms hxRooms);

    /**
     * 修改房间信息
     * 
     * @param hxRooms 房间信息
     * @return 结果
     */
    public int updateHxRooms(HxRooms hxRooms);

    /**
     * 批量删除房间信息
     * 
     * @param ids 需要删除的房间信息ID
     * @return 结果
     */
    public int deleteHxRoomsByIds(Long[] ids);

    /**
     * 删除房间信息信息
     * 
     * @param id 房间信息ID
     * @return 结果
     */
    public int deleteHxRoomsById(Long id);
}
