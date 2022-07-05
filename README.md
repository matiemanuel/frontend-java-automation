# java-automation
Basic example of automation with Java

Exercise:
A person wants to go to buy a car on
www.mercadolibre.com.
He is not sure about what model to buy
and, for this reason, he wants to search
All cars that have a price below
$2.000.000. But he has some
considerations to take into account: The
car must be located in Cordoba, and the
product list must be shown from lowest
to highest price. In addition, he wants to
know the number of results available.

How to execute:

- Clone the repository into your computer
- Have the browser selected already installed in your computer

With command prompt:

Precondition:
- Have a JDK installation on your system.
- Have a maven installation on your system.
- Both of them should be referenced in your environment variables.

** Used as reference: https://maven.apache.org/install.html **

Execution:
- With a command prompt, move to the directory that contains the project and execute:
mvn clean install

- or if you already have the project installed:
mvn test

You should be able to see the result in the command prompt

With IntelliJ idea:
- Open "pom.xml" file and select option: Open as a project
- Wait for dependencies to be installed
- Search for test in src/test/java/com/mercadolibre/test/ChallengeTest and run it

You should be able to see the result in the terminal

Notes:
You can select which browser use by modifying config.yml file. Browser options currently available: chrome, firefox and edge (remember to re-install with 'mvn clean install' in case you change this)