package com.codebase;

public class Printer {
    private int sheetsOfPaper;
    private int toner;

    public Printer(int numberOfPaperSheets, int toner) {
        this.sheetsOfPaper = numberOfPaperSheets;
        this.toner = toner;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public int getToner() {
        return toner;
    }

    public String print(int pages, int copies) {
        int sheetsNeeded = (pages * copies);
        if (sheetsNeeded < this.sheetsOfPaper & sheetsNeeded < this.toner) {
            this.sheetsOfPaper -= sheetsNeeded;
            this.toner -= sheetsNeeded;
            return "Printing Successful";
        } else {
            return "Printing Unsuccessful: Not Enough Paper";
        }
    }
}
