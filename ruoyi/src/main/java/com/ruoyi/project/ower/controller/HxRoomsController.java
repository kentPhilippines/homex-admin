package com.ruoyi.project.ower.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.ower.domain.HxRooms;
import com.ruoyi.project.ower.service.IHxRoomsService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 房间信息Controller
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@RestController
@RequestMapping("/Ower/myform")
public class HxRoomsController extends BaseController
{
    @Autowired
    private IHxRoomsService hxRoomsService;

    /**
     * 查询房间信息列表
     */
    @PreAuthorize("@ss.hasPermi('Ower:myform:list')")
    @GetMapping("/list")
    public TableDataInfo list(HxRooms hxRooms)
    {
        startPage();
        List<HxRooms> list = hxRoomsService.selectHxRoomsList(hxRooms);
        return getDataTable(list);
    }

    /**
     * 导出房间信息列表
     */
    @PreAuthorize("@ss.hasPermi('Ower:myform:export')")
    @Log(title = "房间信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HxRooms hxRooms)
    {
        List<HxRooms> list = hxRoomsService.selectHxRoomsList(hxRooms);
        ExcelUtil<HxRooms> util = new ExcelUtil<HxRooms>(HxRooms.class);
        return util.exportExcel(list, "myform");
    }

    /**
     * 获取房间信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('Ower:myform:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(hxRoomsService.selectHxRoomsById(id));
    }

    /**
     * 新增房间信息
     */
    @PreAuthorize("@ss.hasPermi('Ower:myform:add')")
    @Log(title = "房间信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HxRooms hxRooms)
    {
        return toAjax(hxRoomsService.insertHxRooms(hxRooms));
    }

    /**
     * 修改房间信息
     */
    @PreAuthorize("@ss.hasPermi('Ower:myform:edit')")
    @Log(title = "房间信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HxRooms hxRooms)
    {
        return toAjax(hxRoomsService.updateHxRooms(hxRooms));
    }

    /**
     * 删除房间信息
     */
    @PreAuthorize("@ss.hasPermi('Ower:myform:remove')")
    @Log(title = "房间信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hxRoomsService.deleteHxRoomsByIds(ids));
    }
}
