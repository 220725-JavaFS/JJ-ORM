package com.revature.services;

import java.util.List;

import com.revature.daos.ReportDAO;
import com.revature.daos.ReportDAOImpl;
import com.revature.models.Report;

public class ReportService {
	
	ReportDAO reportDAO = new ReportDAOImpl();
	
	public Report getSingleReport(int id) {
		return reportDAO.getReportById(id);
	}
	
	public ReportDAO getReportDAO() {
		return reportDAO;
	}
	
	public List<Report>reportShow() {
		return reportDAO.getAllAccounts();
	}
	
	public void addAccount(Report report) {
		reportDAO.insertAccount(report);
		
	}
	
	public void deleteAccount(int id ) {
		reportDAO.deleteAccount(id);
	}
	
	public void updateAccount(int id, int grade ) {
		reportDAO.updateAccount(id, grade);
	}
}
