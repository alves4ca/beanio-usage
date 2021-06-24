# beanio-usage
## This is a quick example of how to unmarshal a plain text file delimited by size using the Beanio library for Java.
### Steps
    - Create a POJO file with the required fields
    - Anotate the class with '@Record'
    - Define the field start position and lenght with '@Field' annotation
    - With StreamFactory, define a reader with the annotated POJO
        - BeanIo supports multiple reader formats. The format 'fixedlenght' is used here.
    - It is possible to skip rows with 'BeanReader.skip(<numberOfRows>)' method

`Device.java`
```java
@Record
public class Device {

    @Field(at = 0, length = 15)
    private String macAddress;

    @Field(at = 15, length = 15)
    private String ipAddress;

    @Field(at = 31, length = 9)
    private String hostInterface;
    ...
```
___
`Parser.java`
```java
    public Parser(){
        factory = StreamFactory.newInstance();
        factory.define(new StreamBuilder("devices")
                     .format("fixedlength")
                     .addRecord(Device.class)
        );
     }

    public void readFileUsingBeanIo(File file, int skipHeaders) {
        BeanReader in = factory.createReader("devices", file);
        in.skip(skipHeaders);
        mapRows(in);
    }
```
___
`Test Results`

![Results](TestResults.html)
___
###Reference
http://beanio.org/2.1/docs/reference/index.html

