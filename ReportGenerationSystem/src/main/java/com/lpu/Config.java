package com.lpu;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ReportServices pdfReportService() {
        return new PdfReportService();
    }

    @Bean
    public ExcelReportService excelReportService() {
        return new ExcelReportService();
    }

    @Bean
    public ReportController reportController() {
        return new ReportController(pdfReportService());
    }
}
