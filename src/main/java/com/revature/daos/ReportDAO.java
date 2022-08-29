package com.revature.daos;

import java.util.List;

import com.revature.models.Report;

public interface ReportDAO {

	public abstract Report getReportById(int id);

	public abstract List<Report> getAllAccounts();

	public abstract void insertAccount(Report report);

	public abstract void deleteAccount(int id);
	
	public abstract void updateAccount(int id, int grade);


}
