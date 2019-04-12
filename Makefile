run:
	 mvn compile && mvn exec:java -Dexec.mainClass="br.com.danilopereira.application.Main"

test:
	 mvn clean test
