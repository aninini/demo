package com.lizhishen.play.modules.system.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.lizhishen.play.modules.system.entity.Role;
import com.lizhishen.play.modules.system.dto.input.RoleQueryPara;

import java.util.List;

/**
 * <p>  系统管理-角色表  服务类 </p>
 */
public interface IRoleService extends IService<Role> {

    /**
     * 系统管理-角色表 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
    void listPage(Page<Role> page, RoleQueryPara filter);

    /**
     * 保存系统管理-角色表
     *
     * @param input
     */
    Integer save(Role input);

    /**
     * 系统管理-角色表 列表
     *
     * @param filter
     * @return
     */
    List<Role> list(RoleQueryPara filter);
}
