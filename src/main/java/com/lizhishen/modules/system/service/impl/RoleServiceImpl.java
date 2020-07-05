package com.lizhishen.modules.system.service.impl;

import com.lizhishen.modules.system.entity.Role;
import com.lizhishen.modules.system.dto.input.RoleQueryPara;
import com.lizhishen.modules.system.mapper.RoleMapper;
import com.lizhishen.modules.system.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p> 系统管理-角色表  服务实现类 </p>
 *
 */
@Service
@Transactional
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public void listPage(Page<Role> page, RoleQueryPara filter) {
        page.setRecords(roleMapper.selectRoles(page, filter));
    }

    @Override
    public List<Role> list(RoleQueryPara filter) {
        return roleMapper.selectRoles(filter);
    }

    @Override
    public Integer save(Role para) {
        if (para.getId() != null) {
            roleMapper.updateById(para);
        } else {
            roleMapper.insert(para);
        }
        return para.getId();
    }

}
