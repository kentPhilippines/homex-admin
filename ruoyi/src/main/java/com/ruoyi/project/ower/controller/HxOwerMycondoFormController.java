package com.ruoyi.project.ower.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.front.domain.HxForm;
import com.ruoyi.project.front.service.IHxFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 前台管理Controller
 * 
 * @author ruoyi
 * @date 2020-06-16
 */
@RestController
@RequestMapping("/Ower/mycondo")
public class HxOwerMycondoFormController extends BaseController
{
    @Autowired
    private IHxFormService hxFormService;

    /**
     * 查询前台管理列表
     */
    @PreAuthorize("@ss.hasPermi('Ower:mycondo:list')")
    @GetMapping("/list")
    public TableDataInfo list(HxForm hxForm)
    {
        startPage();
        List<HxForm> list = hxFormService.selectHxFormList(hxForm);
        return getDataTable(list);
    }

    /**
     * 导出前台管理列表
     */
    @PreAuthorize("@ss.hasPermi('Ower:mycondo:export')")
    @Log(title = "前台管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HxForm hxForm)
    {
        List<HxForm> list = hxFormService.selectHxFormList(hxForm);
        ExcelUtil<HxForm> util = new ExcelUtil<HxForm>(HxForm.class);
        return util.exportExcel(list, "mycondo");
    }

    /**
     * 获取前台管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('Ower:mycondo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(hxFormService.selectHxFormById(id));
    }

    /**
     * 新增前台管理
     */
    @PreAuthorize("@ss.hasPermi('Ower:mycondo:add')")
    @Log(title = "前台管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HxForm hxForm)
    {
        return toAjax(hxFormService.insertHxForm(hxForm));
    }

    /**
     * 修改前台管理
     */
    @PreAuthorize("@ss.hasPermi('Ower:mycondo:edit')")
    @Log(title = "前台管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HxForm hxForm)
    {
        return toAjax(hxFormService.updateHxForm(hxForm));
    }

    /**
     * 删除前台管理
     */
    @PreAuthorize("@ss.hasPermi('Ower:mycondo:remove')")
    @Log(title = "前台管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hxFormService.deleteHxFormByIds(ids));
    }
}
