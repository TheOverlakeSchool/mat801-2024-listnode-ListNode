
public class LinkedIntList {
    private ListNode firstNode;
    private int size;

    public LinkedIntList (ListNode node) {
        firstNode = node;
        size = 1;
        ListNode current = node;
        while (current.next != null) {
            current = current.next;
            size++;
        }
    }

    public LinkedIntList () {
        firstNode = null;
        size = 0;
    }

    public void add (int value) {
        if (firstNode == null) {
            firstNode = new ListNode(value);
        } else {
            ListNode container = firstNode;
            while (firstNode.next != null) {
                firstNode = firstNode.next;
            }
            firstNode.next = new ListNode(value);
            firstNode = container;
        }
        size++;
    }

    public void add (int index, int value) throws IndexOutOfBoundsException {
        if (firstNode == null) {
            firstNode = new ListNode(value);
        } else {
            ListNode container = firstNode;
            for (int i = 0; i < index; i++) {
                firstNode = firstNode.next;
                if (firstNode.next == null && i != index - 1) {
                    throw new IndexOutOfBoundsException();
                }
            }
            ListNode container2 = firstNode.next;
            firstNode.next = new ListNode(value, container2);
            firstNode = container;
        }
        size++;
    }

    public int get (int index) {
        if (firstNode == null) {
            throw new IndexOutOfBoundsException();
        }
        ListNode container = firstNode;
        for (int i = 0; i < index + 1; i++) {
            container = container.next;
            if (container.next == null && i != index) {
                throw new IndexOutOfBoundsException();
            }
        }
        return container.data;
    }

    public int indexOf (int value) {
        int index = 0;
        ListNode container = firstNode;
        while (container.next != null) {
            if (container.data == value) {
                return index;
            }
            index++;
            container = container.next;
        }
        return -1;
    }

    public void remove (int index) throws IndexOutOfBoundsException {
        ListNode container = firstNode;
        for (int i = 0; i < index; i++) {
            firstNode = firstNode.next;
            if (firstNode.next == null && i != index - 1) {
                throw new IndexOutOfBoundsException();
            }
        }
        container.next = container.next.next;
        size--;
    }

    public int size() {
        return size;
    }

    public String toString() {
        ListNode current = firstNode;
        String retString = "" + current.data;
        while (current.next != null) {
            current = current.next;
            retString += ", " + current.data;
        }
        return retString;
    }

    public int remove () {
        int value = firstNode.data;
        firstNode = firstNode.next;
        size--;
        return value;
    }

    public boolean isEmpty () {
        return (firstNode == null);
    }

    public void clear () {
        firstNode = null;
        size = 0;
    }

    public boolean contains (int value) {
        ListNode current = firstNode;
        if (current != null) {
            if (current.data == value) {
                return true;
            }
        }
        while(current.next != null) {
            current = current.next;
            if (current.data == value) {
                return true;
            }
        }
        return false;
    }
}
