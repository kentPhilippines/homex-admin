import request from '@/utils/request'

// 查询前台管理列表
export function listMycondo(query) {
  return request({
    url: '/Ower/mycondo/list',
    method: 'get',
    params: query
  })
}

// 查询前台管理详细
export function getMycondo(id) {
  return request({
    url: '/Ower/mycondo/' + id,
    method: 'get'
  })
}

// 新增前台管理
export function addMycondo(data) {
  return request({
    url: '/Ower/mycondo',
    method: 'post',
    data: data
  })
}

// 修改前台管理
export function updateMycondo(data) {
  return request({
    url: '/Ower/mycondo',
    method: 'put',
    data: data
  })
}

// 删除前台管理
export function delMycondo(id) {
  return request({
    url: '/Ower/mycondo/' + id,
    method: 'delete'
  })
}

// 导出前台管理
export function exportMycondo(query) {
  return request({
    url: '/Ower/mycondo/export',
    method: 'get',
    params: query
  })
}