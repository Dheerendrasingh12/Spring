
        package com.nacre.beans;

import java.util.Date;
import java.util.Set;

public class Project {

	private int projectId;
	private String projectTitel;
	private Date startDate;
	private Date endDate;
	
	private Set<String> empSet;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitel() {
		return projectTitel;
	}

	public void setProjectTitel(String projectTitel) {
		this.projectTitel = projectTitel;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public Set<String> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<String> empSet) {
		this.empSet = empSet;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectTitel=" + projectTitel + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", empSet=" + empSet + "]";
	}
	
	
	
}
