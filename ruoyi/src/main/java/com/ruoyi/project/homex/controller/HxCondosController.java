package com.ruoyi.project.homex.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiKeyAuthDefinition;
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
import com.ruoyi.project.homex.domain.HxCondos;
import com.ruoyi.project.homex.service.IHxCondosService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 公寓Controller
 *
 * @author ruoyi
 * @date 2020-06-16
 */
@RestController
@RequestMapping("/homex/condo")
@Api(value="/homex/condo",description="公寓相关接口信息")
public class HxCondosController extends BaseController {
    @Autowired
    private IHxCondosService hxCondosService;
    /**
     * 查询公寓列表
     */
    @PreAuthorize("@ss.hasPermi('homex:condo:list')")
    @RequestMapping("/list")
    @ApiOperation(value = "查询公寓列表",httpMethod = "GET OR POST",response = TableDataInfo.class)
    public TableDataInfo list(HxCondos hxCondos) {
        startPage();
        List<HxCondos> list = hxCondosService.selectHxCondosList(hxCondos);
        return getDataTable(list);
    }
    /**
     * 导出公寓列表
     */
    @PreAuthorize("@ss.hasPermi('homex:condo:export')")
    @Log(title = "公寓", businessType = BusinessType.EXPORT)
    @ApiOperation(value = "导出公寓信息",httpMethod = "GET OR POST",response = AjaxResult.class)
    @RequestMapping("/export")
    public AjaxResult export(HxCondos hxCondos) {
        List<HxCondos> list = hxCondosService.selectHxCondosList(hxCondos);
        ExcelUtil<HxCondos> util = new ExcelUtil<HxCondos>(HxCondos.class);
        return util.exportExcel(list, "condo");
    }

    /**
     * 获取公寓详细信息
     */
    @PreAuthorize("@ss.hasPermi('homex:condo:query')")
    @ApiOperation(value = "根据公寓数据ID查询公寓信息",httpMethod = "GET OR POST",response = AjaxResult.class)
    @RequestMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(hxCondosService.selectHxCondosById(id));
    }

    /**
     * 新增公寓
     */
    @PreAuthorize("@ss.hasPermi('homex:condo:add')")
    @Log(title = "公寓", businessType = BusinessType.INSERT)
    @ApiOperation(value = "新增功公寓信息",httpMethod = "POST",response = AjaxResult.class)
    @PostMapping
    public AjaxResult add(@RequestBody HxCondos hxCondos) {
        return toAjax(hxCondosService.insertHxCondos(hxCondos));
    }

    /**
     * 修改公寓
     */
    @PreAuthorize("@ss.hasPermi('homex:condo:edit')")
    @Log(title = "公寓", businessType = BusinessType.UPDATE)
    @ApiOperation(value = "修改公寓信息",httpMethod = "PUT",response = AjaxResult.class)
    @PutMapping
    public AjaxResult edit(@RequestBody HxCondos hxCondos) {
        return toAjax(hxCondosService.updateHxCondos(hxCondos));
    }

    /**
     * 删除公寓
     */
    @PreAuthorize("@ss.hasPermi('homex:condo:remove')")
    @Log(title = "公寓", businessType = BusinessType.DELETE)
    @ApiOperation(value = "删除公寓信息",httpMethod = "DELETE",response = AjaxResult.class)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(hxCondosService.deleteHxCondosByIds(ids));
    }
}
