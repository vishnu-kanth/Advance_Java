package com.lpu;

public class ReportController {

    private ReportServices reportService;

    public ReportController(ReportServices reportService) {
        this.reportService = reportService;
    }

    public void createReport() {
        reportService.generateReport();
    }
}