package com.lizhishen.play.modules.system.dto.output;

import com.google.common.collect.Lists;
import com.lizhishen.play.modules.system.entity.User;
import lombok.Data;

import java.util.List;

/**
 * <p> 用户树节点 </p>
 *
 */
@Data
public class UserTreeNode extends User {

    List<UserTreeNode> children = Lists.newArrayList();

}
