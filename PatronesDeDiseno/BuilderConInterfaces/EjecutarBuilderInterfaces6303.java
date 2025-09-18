public class EjecutarBuilderInterfaces6303 {
    public static void main(String[] args) {
        
        //Creación de los objetos de tipo Converter
        Converter objC1 = new ASCIIConverter();
        Converter objC2 = new PostScriptConverter();
        Converter objC3 = new PDFConverter();

        //Relacionar los objetos con la clase Reader
        Reader objR1 = new Reader("LINE", objC1);
        Reader objR2 = new Reader("LINE", objC2);
        Reader objR3 = new Reader("TABLE", objC3);
        Reader objR4 = new Reader("TABLE", objC1);

        //ASCII con Line
        objR1.parseInput();
        //PostScript con Line
        objR2.parseInput();
        //PDF con Table
        objR3.parseInput();
        //ASCII con Table
        objR4.parseInput();

    }
}