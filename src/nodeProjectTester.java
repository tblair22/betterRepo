/*
Trent Blair
10/6/21
The purpose of this project is to test my nodeProject
 */

public class nodeProjectTester {
    public static void main(String[] args) {

        nodeProject testA = new nodeProject();
        nodeProject testB = new nodeProject(3);//tests the constructors
        nodeProject testC = new nodeProject(3, testA, testB);


        testA.toString();
        testB.toString();//tests the toStrings
        testC.toString();


        testB.setFirstNode(testC);
        testA.setSecondNode(testC);//tests the get second node
        System.out.println(testA.equals(testB));
        testA.setValue("Node is Epic");
        System.out.println(testA.equals(testC));

    }
}
