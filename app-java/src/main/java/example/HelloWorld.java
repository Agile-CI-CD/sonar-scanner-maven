package example;

public class HelloWorld {

  public void coveredByUnitTest() {
    System.out.println("coveredByUnitTest1");
    System.out.println("coveredByUnitTest2");
  }

  public void coveredByIntegrationTest() {
    System.out.println("coveredByIntegrationTest1");
 
  }

  public void notCovered() {
    System.out.println("notCovered");
  }

}
