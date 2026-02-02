package Java_Practice.SOLID_Principle.InterfaceSegregationPrinciple;

class BasicPrinterMachine implements Printer{

    @Override
    public void Print() {
        System.out.println("Printing the page....");
    }
}
class BasicFaxMachine implements Fax{

    @Override
    public void fax() {
        System.out.println("Fax the document...");
    }
}

class BasicScannerMachine implements Scanner{

    @Override
    public void scan() {
        System.out.println("Scanning the document...");
    }
}

class AllinOneMachine implements Printer,Fax,Scanner{

    @Override
    public void fax() {
        System.out.println("Faxing document...");
    }

    @Override
    public void Print() {
        System.out.println("Printing the Details...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning the documents...");
    }
}
public class InterfaceSegregation {
    public static void main(String[] args) {

        BasicPrinterMachine printer = new BasicPrinterMachine();
        printer.Print();
        BasicFaxMachine fax = new BasicFaxMachine();
        fax.fax();
        BasicScannerMachine scanner = new BasicScannerMachine();
        scanner.scan();
    }
}
