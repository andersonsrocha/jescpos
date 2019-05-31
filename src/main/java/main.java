
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintService;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.escPosConst.Enum;
import org.jescpos.Jescpos;
import org.stream.PrinterOutputStream;

/*
 * The MIT License
 *
 * Copyright 2019 development.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 * @author development
 */
public class main {
    public static void main(String[] args) throws IOException {
        PrintService printService = PrinterOutputStream.getServicePrinterByName("Elgin");
        PrinterOutputStream printerOutputStream = new PrinterOutputStream(printService);
        Jescpos jescpos = new Jescpos(printerOutputStream);
        jescpos.text("HYPERMENO");
        jescpos.text(" / CUPOM NAO FISCAL");
        jescpos.close();
    }
}