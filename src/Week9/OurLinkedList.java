package Week9;

public class OurLinkedList {
    //instance variable
    private Node firstNode;


    //Constructor
    public OurLinkedList() {
        firstNode = null;
    }
    //addNode
    public void addNode(int value) {
        //create new Node and then decide where it goes
        Node newNode = new Node(value);
        if (firstNode == null) {
            firstNode  = newNode;
        } else {
            Node currentNode = firstNode;
            while (currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }

    public int getValue(int position) {
        int index = 0;
        if (size() > position) {
            Node currentNode = firstNode;
            while (index < position) {
                index++;
                currentNode = currentNode.getLink();
            }
            return currentNode.getValue();
        } else {
            return -1;
        }
    }

    public int size() {
        int count = 0;
        Node currentNode = firstNode;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }

    //insert
    public void insert(int position, int value) {
        if (position >= size()) {
            addNode(value);
        } else {
            Node newNode = new Node(value);
            if (position == 0) {
                newNode.setLink(firstNode);
                firstNode = newNode;
            } else {
                int index = 0;
                Node currentNode = firstNode;
                while (index < position - 1) {
                    index++;
                    currentNode = currentNode.getLink();
                }
                Node tempNode = currentNode.getLink();
                currentNode.setLink(newNode);
                newNode.setLink(tempNode);
            }
        }

    }
    //Remove
    public void remove(int position) {

    }

    //toString
    public String toString() {
        String out = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            out = out + currentNode.getValue() + " ";
            currentNode = currentNode.getLink();
        }
        return out;
    }
}
