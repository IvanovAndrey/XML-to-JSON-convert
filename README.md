# XML-to-JSON-convert
 XML-to-JSON-convert service. It's written in Java with use of SpringBoot framework.
 ## How it works
 
 ```
 Method:          POST
  Path:            /course-work
  Content-Type:    row/form-data
  -------------------------------------------------------------------
  Content-Disposition: form-data; name="xml"; filename="TestXML.xml"
  Content-Type: text/plain

  content of TestXML.xml.
  -------------------------------------------------------------------
  and sends responses of the following form:

  Status-Code:     200 (Accepted)
  Content-Type:    json;charset=UTF-8`
```
## Usage

### Building 

To build this you need import project in your IDE

Then build the project in IDE 

Build with gradle command 
 
`$ ./gradle build`

Build docker with task 

`$ ./gradle buildDocker`

Run application with task 

`$ ./gradle runDocker`

### HTTP-client 

You can use [Postman HTTP-client](https://www.getpostman.com/) for this case. Form a request in a way it formed in figure below:

![Request](/figs/request.jpg)

Response should looks like:

![Response](/figs/response.jpg)
