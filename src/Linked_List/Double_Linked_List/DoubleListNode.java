package Linked_List.Double_Linked_List;

public class DoubleListNode<T> {
    private T data;
    private DoubleListNode nextLink;
    private DoubleListNode previousLink;

    public DoubleListNode() {
        data = null;
        nextLink = null;
        previousLink = null;
    }

    public DoubleListNode(T data, DoubleListNode nextLink, DoubleListNode previousLink) {
        this.data = data;
        this.nextLink = nextLink;
        this.previousLink = previousLink;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleListNode getNextLink() {
        return nextLink;
    }

    public void setNextLink(DoubleListNode nextLink) {
        this.nextLink = nextLink;
    }

    public DoubleListNode getPreviousLink() {
        return previousLink;
    }

    public void setPreviousLink(DoubleListNode previousLink) {
        this.previousLink = previousLink;
    }

    @Override
    public String toString() {
        return "<--" + data + "-->";
    }
}
