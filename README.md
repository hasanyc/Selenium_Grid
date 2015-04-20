# Selenium_Grid
Cross-browser Testing by Hasan

Selenium Grid

1. Download seleninum server standalone
2. Create a hub
3. Register a hub
4. Open CMD
5. java -jar selenium-server-standalone-2.45.0.jar -role hub
6. Verify if server has been registered
7. Go to http://localhost:4444/grid/console 

8. Hub Machine: (ipconfig) - write the IP HERE (local)
9. Node Machine: WRITE THE IP FROM 2ND PC
10. From second pc, visit http://(HUB PC IP):4444/GRID/CONSOLE

11. Register the node (2nd PC) using 
java -jar selenium-server-standalone-2.45.0.jar -role webdriver -hub http://IP FROM STEP 8:4444/grid/register -port 5566

12. Verify if node has been register by entering step 7 in Hub Machine - you should see the node IP Address



Cross-browser
==========================

-Dwebdriver.chrome.driver
-Dwebdriver.ie.driver

java -jar selenium-server-standalone-2.45.0.jar -role webdriver -hub http://
localhost:4444/grid/register -port 5577 -browser browserName=firefox -browser br
owserName=chrome -browser browserName=iexplore

-maxSession (int) - How many browser you want to open at a time (all way at the end of command)
Ex: java -jar selenium-server-standalone-2.45.0.jar -role webdriver -hub http://
localhost:4444/grid/register -port 5577 -browser browserName=firefox -browser br
owserName=chrome -browser browserName=iexplore maxSession 3 (so three browser will open at a time)

-maxInstances=(int) - How many browsers you want to use (write this comment next to browser)
Ex: java -jar selenium-server-standalone-2.45.0.jar -role webdriver -hub http://
localhost:4444/grid/register -port 5577 -browser browserName=firefox,-maxInstances=2 -browser browserName=chrome,-maxInstances=5 -browser browserName=iexplore,-maxInstances=1 -maxSession 3





java -Dwebdriver.chrome.driver=C:\Users\Hassan\workspace\Drivers\chromedriver.exe -jar selenium-server-standalone-2.45.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 5577 -browser browserName=firefox,-maxInstances=5 -browser browserName=chrome,-maxInstances=5 -browser browserName=iexplore,-maxInstances=1 -maxSession 3


Node 1: (HUB PC)
java -Dwebdriver.chrome.driver=C:\Drivers\chromedriver.exe -jar selenium-server-standalone-2.45.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 5556 -browser browserName=firefox,maxInstances=2 -browser browserName=chrome,maxInstances=3 -browser browserName=iexplore,maxInstances=2 -maxSession 3

Node 2: (node pc)
java -Dwebdriver.chrome.driver=C:\Drivers\chromedriver.exe -jar selenium-server-standalone-2.45.0.jar -role webdriver -hub http://IP-LOCAL-PC:4444/grid/register -port 5557 -browser browserName=firefox,maxInstances=1 -browser browserName=chrome,maxInstances=1 -browser browserName=iexplore,maxInstances=1 -maxSession 1

