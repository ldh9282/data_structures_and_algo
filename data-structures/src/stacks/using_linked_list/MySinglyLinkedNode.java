package stacks.using_linked_list;

public class MySinglyLinkedNode {

  private Object value;
  private MySinglyLinkedNode next;

  public MySinglyLinkedNode(Object value) {
    this.value = value;
    this.next = null;
  }

  public MySinglyLinkedNode(Object value, MySinglyLinkedNode next) {
    this.value = value;
    this.next = next;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public MySinglyLinkedNode getNext() {
    return next;
  }

  public void setNext(MySinglyLinkedNode next) {
    this.next = next;
  }
}
