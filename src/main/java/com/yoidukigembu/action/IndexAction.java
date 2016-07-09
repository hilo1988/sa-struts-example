package com.yoidukigembu.action;

import org.seasar.framework.container.filter.S2ContainerFilter;
import org.seasar.struts.annotation.Execute;

public class IndexAction {
	
	@Execute(validator = false)
	
	public String index() {
		return "index.jsp";
	}
}
