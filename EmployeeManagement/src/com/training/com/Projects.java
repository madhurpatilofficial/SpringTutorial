package com.training.com;

public class Projects {

	private String projectName;
	private String projectManager;
	private String duration;

	public Projects() {
		System.out.println("This is a default constructor");
	}

	public Projects(String projectName, String projectManager, String duration) {
		System.out.println("This is a parameterised constructor");
		this.projectName = projectName;
		this.projectManager = projectManager;
		this.duration = duration;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Projects [projectName=" + projectName + ", projectManager=" + projectManager + ", duration=" + duration
				+ "]";
	}

}
