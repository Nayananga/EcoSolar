Red-drops is a USSD application. This application facilitate more donors to support to the national blood supply system.


===============
How to Build
===============


1. How to start the simulator

    i. Go to the following folder using terminal or command prompt
        "sdk-standalone-1.0.55.dlg-SNAPSHOT\bin"

    ii. To run the simulator, execute the following command
        sdp-simulator console


2. Create a mysql database named red_drops ,then import the given red_drops.sql file

3. To run the Red-Drops
    i) To change the lib path, edit the pom.xml file inside the Red-Drops folder in pom.xml
        there is a tag called <ideamart.lib>Full-Path-for-Red-drops\Red-drops\lib</ideamart.lib>
        instead of this path you have to give your correct path.

    ii) Go to the RedDrops folder path using command prompt then execute the following command
          mvn clean install jetty:run

4. go to the browser , type localhost:10001 then you can see the simulator
    and then goto the USSD tab
          -In URL type
                http://localhost:8999/service-provider/
          -from second time(i.e for send the menu numbers) onwards change the value of the
          USSD Operation Types 'mo-init' to 'mo-cont'

