package com.poc.parser.main;

import com.poc.parser.model.Device;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;
import org.beanio.builder.StreamBuilder;

import java.io.File;
import java.io.Reader;

public class Parser {
    StreamFactory factory;

    public Parser(){
        factory = StreamFactory.newInstance();
        factory.define(new StreamBuilder("devices")
                .format("fixedlength")
                .addRecord(Device.class)
        );
    }

    public void readFileUsingBeanIo(File file) {
        BeanReader in = factory.createReader("devices", file);
        mapRows(in);
    }

    public void readFileUsingBeanIo(File file, int skipHeaders) {
        BeanReader in = factory.createReader("devices", file);
        in.skip(skipHeaders);
        mapRows(in);
    }

    public void readFileUsingBeanIo(Reader inputReader) {
        BeanReader in = factory.createReader("devices", inputReader);
        mapRows(in);
    }

    public void readFileUsingBeanIo(Reader inputReader, int skipHeaders) {
        BeanReader in = factory.createReader("devices", inputReader);
        in.skip(skipHeaders);
        mapRows(in);
    }

    private void mapRows(BeanReader in) {
        Device device;
        while ((device = (Device) in.read()) != null) {
            System.out.println(device);
        }
        in.close();
    }
}
