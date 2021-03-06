package com.ruoyi.project.front.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
import com.ruoyi.project.front.domain.HxForm;
import com.ruoyi.project.front.service.IHxFormService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 前台管理Controller
 * @author ruoyi
 * @date 2020-06-16
 */
@RestController
@RequestMapping("/front/moving")
@Api(value = "/front/moving", description = "公寓相关接口信息")
public class HxFormController extends BaseController {
    @Autowired
    private IHxFormService hxFormService;

    /**
     * 查询前台管理列表
     */
    @PreAuthorize("@ss.hasPermi('front:moving:list')")
    @RequestMapping("/list")
    @ApiOperation(value = "查询前台管理列表",httpMethod = "GET OR POST",response = TableDataInfo.class)
    public TableDataInfo list(HxForm hxForm) {
        startPage();
        List<HxForm> list = hxFormService.selectHxFormList(hxForm);
        return getDataTable(list);
    }

    /**
     * 导出前台管理列表
     */
    @PreAuthorize("@ss.hasPermi('front:moving:export')")
    @Log(title = "前台管理", businessType = BusinessType.EXPORT)
    @RequestMapping("/export")
    @ApiOperation(value = "导出前台管理列表",httpMethod = "GET OR POST",response = AjaxResult.class)
    public AjaxResult export(HxForm hxForm) {
        List<HxForm> list = hxFormService.selectHxFormList(hxForm);
        ExcelUtil<HxForm> util = new ExcelUtil<HxForm>(HxForm.class);
        return util.exportExcel(list, "moving");
    }

    /**
     * 获取前台管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('front:moving:query')")
    @RequestMapping(value = "/{id}")
    @ApiOperation(value = "获取前台管理详细信息",httpMethod = "GET OR POST",response = AjaxResult.class)
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(hxFormService.selectHxFormById(id));
    }

    /**
     * 新增前台管理
     */
    @PreAuthorize("@ss.hasPermi('front:moving:add')")
    @Log(title = "前台管理", businessType = BusinessType.INSERT)
    @ApiOperation(value = "新增前台管理",httpMethod = "POST",response = AjaxResult.class)
    @PostMapping
    public AjaxResult add(@RequestBody HxForm hxForm) {
        return toAjax(hxFormService.insertHxForm(hxForm));
    }

    /**
     * 修改前台管理
     */
    @PreAuthorize("@ss.hasPermi('front:moving:edit')")
    @Log(title = "前台管理", businessType = BusinessType.UPDATE)
    @ApiOperation(value = "修改前台管理",httpMethod = "Put",response = AjaxResult.class)
    @PutMapping
    public AjaxResult edit(@RequestBody HxForm hxForm) {
        return toAjax(hxFormService.updateHxForm(hxForm));
    }

    /**
     * 删除前台管理
     */
    @PreAuthorize("@ss.hasPermi('front:moving:remove')")
    @Log(title = "前台管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(hxFormService.deleteHxFormByIds(ids));
    }
}
