package com.softyorch.designpatterns.creational.factoryMethod

fun main() {
    val pdfGenerator: IReportGenerator = PDFReportGenerator()
    val pdfReport: Report = pdfGenerator.generateReport()
    println("Informe en formato PDF: ${pdfReport.content}")

    val excelGenerator: IReportGenerator = ExcelReportGenerator()
    val excelReport: Report = excelGenerator.generateReport()
    println("Informe en formato Excel: ${excelReport.content}")
}