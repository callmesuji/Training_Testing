package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	public static void main(String[] args) {

		Client client = new Client();
		Company company = new Company();
		Employee employee = new Employee();
		Project project = new Project();

		client.clientName();
		company.companyName();
		employee.empName();
		project.projectName();

	}

	public static void empName() {

	}

}
