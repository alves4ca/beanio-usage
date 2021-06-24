package com.poc.parser.main;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;

@RunWith(JUnit4.class)
public class ParserTest {

    Parser parser = new Parser();
    Reader inputReader;
    Reader inputReaderWithHeaders;

    @Before
    public void init(){
        inputReader = new StringReader(ParserTestDefinition.INPUT);
        inputReaderWithHeaders = new StringReader(ParserTestDefinition.INPUT_WITH_HEADERS);
    }

    @Test
    public void read_FileFromDisk_MapItToPOJO_Success() {
        parser.readFileUsingBeanIo(new File("src/main/resources/data/input.txt"));
    }

    @Test
    public void read_FileFromDisk_Skip4HeadersAndMapItToPOJO_Success() {
        parser.readFileUsingBeanIo(new File("src/main/resources/data/input_with_headers.txt"), 4);
    }

    @Test
    public void read_String_MapItToPOJO_Success() {
        parser.readFileUsingBeanIo(inputReader);
    }

    @Test
    public void read_String_Skip4HeadersAndMapItToPOJO_Success() {
        parser.readFileUsingBeanIo(inputReader, 4);
    }
}