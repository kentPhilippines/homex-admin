import request from '@/utils/request'

// 查询公寓列表
export function listCondo(query) {
  return request({
    url: '/homex/condo/list',
    method: 'get',
    params: query
  })
}

// 查询公寓详细
export function getCondo(id) {
  return request({
    url: '/homex/condo/' + id,
    method: 'get'
  })
}

// 新增公寓
export function addCondo(data) {
  return request({
    url: '/homex/condo',
    method: 'post',
    data: data
  })
}

// 修改公寓
export function updateCondo(data) {
  return request({
    url: '/homex/condo',
    method: 'put',
    data: data
  })
}

// 删除公寓
export function delCondo(id) {
  return request({
    url: '/homex/condo/' + id,
    method: 'delete'
  })
}

// 导出公寓
export function exportCondo(query) {
  return request({
    url: '/homex/condo/export',
    method: 'get',
    params: query
  })
}