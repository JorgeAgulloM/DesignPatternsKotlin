package com.softyorch.designpatterns.creational.factoryMethod

class ExcelReportGenerator: IReportGenerator {
    override fun generateReport(): Report {
        return Report(
            title = "Report in Excel",
            content = "Content to Excel",
            owner = "Jorge"
        )
    }
}