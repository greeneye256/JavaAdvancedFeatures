package enums;

public enum PrinterType {
    DOT_MATRIX("Imprimanta matriciala",12),
    INK_JET("Imprimanta cu cerneala",43),
    LASER("Imprimanta laser",67),
    _3D("Imprimanta 3D",0);

    private final String description;
    private final int printCapacity;

    PrinterType (String description, int printCapacity){
        this.description = description;
        this.printCapacity = printCapacity;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPrintCapacity() {
        return printCapacity;
    }

    public static PrinterType matchPrinterType(String printerDescription){
        for (PrinterType printerType:PrinterType.values()
             ) {
            if (printerDescription.equalsIgnoreCase(printerType.getDescription())){
                return printerType;
            }
        }
        throw new UnknownPrinter(String.format("Nu exista: '%s'", printerDescription));
    }
    public static class UnknownPrinter extends RuntimeException {
        UnknownPrinter(String message){
            super(message);
        }
    }
}
