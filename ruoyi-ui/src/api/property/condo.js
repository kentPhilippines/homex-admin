import request from '@/utils/request'

// 查询物业管理列表
export function listCondo(query) {
  return request({
    url: '/property/condo/list',
    method: 'get',
    params: query
  })
}

// 查询物业管理详细
export function getCondo(id) {
  return request({
    url: '/property/condo/' + id,
    method: 'get'
  })
}

// 新增物业管理
export function addCondo(data) {
  return request({
    url: '/property/condo',
    method: 'post',
    data: data
  })
}

// 修改物业管理
export function updateCondo(data) {
  return request({
    url: '/property/condo',
    method: 'put',
    data: data
  })
}

// 删除物业管理
export function delCondo(id) {
  return request({
    url: '/property/condo/' + id,
    method: 'delete'
  })
}

// 导出物业管理
export function exportCondo(query) {
  return request({
    url: '/property/condo/export',
    method: 'get',
    params: query
  })
}