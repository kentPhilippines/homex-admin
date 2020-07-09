import request from '@/utils/request'

// 查询房间信息列表
export function listMyform(query) {
  return request({
    url: '/Ower/myform/list',
    method: 'get',
    params: query
  })
}

// 查询房间信息详细
export function getMyform(id) {
  return request({
    url: '/Ower/myform/' + id,
    method: 'get'
  })
}

// 新增房间信息
export function addMyform(data) {
  return request({
    url: '/Ower/myform',
    method: 'post',
    data: data
  })
}

// 修改房间信息
export function updateMyform(data) {
  return request({
    url: '/Ower/myform',
    method: 'put',
    data: data
  })
}

// 删除房间信息
export function delMyform(id) {
  return request({
    url: '/Ower/myform/' + id,
    method: 'delete'
  })
}

// 导出房间信息
export function exportMyform(query) {
  return request({
    url: '/Ower/myform/export',
    method: 'get',
    params: query
  })
}