package com.lizhishen.modules.system.dto.output;

import com.google.common.collect.Lists;
import com.lizhishen.modules.system.entity.Menu;
import lombok.Data;

import java.util.List;

/**
 * <p> 菜单树节点 </p>
 *
 */
@Data
public class MenuTreeNode extends Menu {

    List<MenuTreeNode> children = Lists.newArrayList();

}
