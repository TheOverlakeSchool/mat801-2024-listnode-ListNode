public class ListNodeClient {
    public static void main(String[] args) {
//        int a = 7;
//        int b = 35;
//
//        // swap a with b
//        swap(a, b);
//
//        System.out.println(a + " " + b);

//        Strange strange = new Strange();
//        System.out.println(strange == null);

//        ListNode list = new ListNode(42, new ListNode(-3, new ListNode(17)));
//        list.data = 42;
//        list.next = new ListNode();
//        list.next.data = -3;
//        list.next.next = new ListNode();
//        list.next.next.data = 17;
//        list.next.next.next = null;
//        System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);

        ListNode list = new ListNode(10, new ListNode(20));
        // list.next.next = new ListNode(30);
//
//        ListNode list2 = new ListNode(30, list);
//        list = list2;

        list = new ListNode(30, list);

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
