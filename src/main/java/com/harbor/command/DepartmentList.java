package com.harbor.command;

import java.util.ArrayList;
import java.util.List;

public class DepartmentList {


private List<DepartmentCommand>departmentllist=new ArrayList<>();

public DepartmentList(List<DepartmentCommand> departmentllist) {
	super();
	this.departmentllist = departmentllist;
}

public List<DepartmentCommand> getDepartmentllist() {
	return departmentllist;
}

public void setDepartmentllist(List<DepartmentCommand> departmentllist) {
	this.departmentllist = departmentllist;
}
}
