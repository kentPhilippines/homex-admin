import request from '@/utils/request'

// 查询前台管理列表
export function listMoving(query) {
  return request({
    url: '/front/moving/list',
    method: 'get',
    params: query
  })
}

// 查询前台管理详细
export function getMoving(id) {
  return request({
    url: '/front/moving/' + id,
    method: 'get'
  })
}

// 新增前台管理
export function addMoving(data) {
  return request({
    url: '/front/moving',
    method: 'post',
    data: data
  })
}

// 修改前台管理
export function updateMoving(data) {
  return request({
    url: '/front/moving',
    method: 'put',
    data: data
  })
}

// 删除前台管理
export function delMoving(id) {
  return request({
    url: '/front/moving/' + id,
    method: 'delete'
  })
}

// 导出前台管理
export function exportMoving(query) {
  return request({
    url: '/front/moving/export',
    method: 'get',
    params: query
  })
}