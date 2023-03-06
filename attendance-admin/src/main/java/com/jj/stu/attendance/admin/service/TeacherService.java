package com.jj.stu.attendance.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jj.stu.attendance.dao.model.Teacher;
import com.jj.stu.attendance.meta.request.ManageTeacherRequest;
import com.jj.stu.attendance.meta.request.PageTeacherRequest;
import com.jj.stu.attendance.meta.response.PageTeacherResponse;

public interface TeacherService extends IService<Teacher> {
    /**
     * 老师列表页
     *
     * @param request 请求
     * @return {@link PageTeacherResponse}
     */
    PageTeacherResponse pageTeacherList(PageTeacherRequest request);

    /**
     * 更新教师信息
     *
     * @param request 要求
     */
    void updateTeacherInfo(ManageTeacherRequest request);
}
