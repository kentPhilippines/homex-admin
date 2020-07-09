package com.ruoyi.project.property.controller;

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
import com.ruoyi.project.property.domain.HxPropertymanagement;
import com.ruoyi.project.property.service.IHxPropertymanagementService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 物业管理Controller
 *
 * @author ruoyi
 * @date 2020-06-16
 */
@RestController
@RequestMapping("/property/condo")
public class HxPropertymanagementController extends BaseController {
    @Autowired
    private IHxPropertymanagementService hxPropertymanagementService;

    /**
     * 查询物业管理列表
     */
    @PreAuthorize("@ss.hasPermi('property:condo:list')")
    @GetMapping("/list")
    public TableDataInfo list(HxPropertymanagement hxPropertymanagement) {
        startPage();
        List<HxPropertymanagement> list = hxPropertymanagementService.selectHxPropertymanagementList(hxPropertymanagement);
        return getDataTable(list);
    }

    /**
     * 导出物业管理列表
     */
    @PreAuthorize("@ss.hasPermi('property:condo:export')")
    @Log(title = "物业管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HxPropertymanagement hxPropertymanagement) {
        List<HxPropertymanagement> list = hxPropertymanagementService.selectHxPropertymanagementList(hxPropertymanagement);
        ExcelUtil<HxPropertymanagement> util = new ExcelUtil<HxPropertymanagement>(HxPropertymanagement.class);
        return util.exportExcel(list, "condo");
    }

    /**
     * 获取物业管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('property:condo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(hxPropertymanagementService.selectHxPropertymanagementById(id));
    }

    /**
     * 新增物业管理
     */
    @PreAuthorize("@ss.hasPermi('property:condo:add')")
    @Log(title = "物业管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HxPropertymanagement hxPropertymanagement) {
        return toAjax(hxPropertymanagementService.insertHxPropertymanagement(hxPropertymanagement));
    }

    /**
     * 修改物业管理
     */
    @PreAuthorize("@ss.hasPermi('property:condo:edit')")
    @Log(title = "物业管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HxPropertymanagement hxPropertymanagement) {
        return toAjax(hxPropertymanagementService.updateHxPropertymanagement(hxPropertymanagement));
    }

    /**
     * 删除物业管理
     */
    @PreAuthorize("@ss.hasPermi('property:condo:remove')")
    @Log(title = "物业管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(hxPropertymanagementService.deleteHxPropertymanagementByIds(ids));
    }
}
