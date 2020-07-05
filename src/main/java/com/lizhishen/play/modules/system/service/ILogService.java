package com.lizhishen.play.modules.system.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.lizhishen.play.modules.system.entity.SysLog;
import com.lizhishen.play.modules.system.dto.input.LogQueryPara;

import java.util.List;

/**
 * <p>  系统管理 - 日志表 服务类 </p>
 *
 */
public interface ILogService extends IService<SysLog> {

    /**
     * 系统管理 - 日志表列表分页
     *
     * @param page
     * @param para
     * @return
     */
    void listPage(Page<SysLog> page, LogQueryPara para);

    /**
     * 保存系统管理 - 日志表
     *
     * @param input
     */
    Integer save(SysLog input);

    /**
     * 系统管理 - 日志表列表
     *
     * @param para
     * @return
     */
    List<SysLog> list(LogQueryPara para);

}
