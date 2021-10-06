/*
Trent Blair
10/6/21
The purpose of this project is to set up the node Project and use type T syntax
 */

public class nodeProject <T>{

    private nodeProject nodeOne;
    private nodeProject nodeTwo;

    private T value;

    public nodeProject(){
        nodeOne = null;
        nodeTwo = null;
    }

    public nodeProject(T value){
        nodeOne = null;
        nodeTwo = null;
        this.value = value;
    }

    public nodeProject(T value, nodeProject node1, nodeProject node2){
        this.nodeOne = node1.nodeOne;
        this.nodeTwo = node2.nodeTwo;
        this.value = value;
    }


    //Mutators

    public void setValue(T value){
        this.value = value;
    }

    public void setFirstNode(nodeProject nodeOne){
        this.nodeOne = nodeOne;
        makeChild(nodeOne);
    }

    public void setSecondNode(nodeProject nodeTwo) {
        this.nodeTwo = nodeTwo;
        makeParent(nodeTwo);
    }

    private void makeChild(nodeProject nodeOne){//child node
        this.nodeOne = nodeOne;
    }

    private void makeParent(nodeProject nodeTwo){//parent node
        this.nodeTwo = nodeTwo;
    }

    //accessors

    public T getValue(){
        return value;
    }

    public nodeProject getFirstNode(){
        return nodeOne;
    }

    public nodeProject getSecondNode(){
        return nodeTwo;
    }

    public String toString(){//to string method
        if (value == null) return "";
        else return "Node: "+ value.toString();
    }

    public boolean equals(nodeProject node){
        if (this.value == null && node.value == null){
            return true;
        } else if (this.value == null || node.value == null){
            return false;
        } else return this.value == node.value;

    }


}
