/*
 * The MIT License
 *
 * Copyright 2019 Anderson Silva.
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
package org.jescpos;

import org.escPosConst.Enum;

import java.io.*;

/**
 * @author Anderson Silva
 */
public class Jescpos implements Enum, Closeable, Flushable {
    private final OutputStream outputStream;

    public Jescpos(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    /**
     * Sends a raw byte array to the printer.
     *
     * @param bytes byte array
     * @return {@link Jescpos}
     */
    private Jescpos bytes(byte bytes[]) throws IOException {
        outputStream.write(bytes);
        return this;
    }

    /**
     * Sends a string to the printer.
     *
     * @param text string
     * @return {@link Jescpos}
     */
    public Jescpos text(String text) throws IOException {
        return bytes(text.getBytes());
    }

    @Override
    public void close() throws IOException {
        outputStream.close();
    }

    @Override
    public void flush() throws IOException {
        outputStream.flush();
    }
}
