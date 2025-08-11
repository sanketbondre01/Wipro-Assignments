package com.sb.solid;

class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
class ReportPrinter {
    public void printReport(Report report) {
        System.out.println("Printing Report: " + report.getContent());
    }
}

public class SingleResponsibilityPrinciple {

	public static void main(String[] args) {
		Report report = new Report("This is a monthly sales report.");
		
		ReportPrinter printer = new ReportPrinter();
		
		printer.printReport(report);

	}

}
