package com.softyorch.designpatterns.creational.factoryMethod

class PDFReportGenerator: IReportGenerator {
    override fun generateReport(): Report {
        return Report(
            title = "Report in PDF",
            content = "Content to PDF",
            owner = "Jorge"
        )
    }
}