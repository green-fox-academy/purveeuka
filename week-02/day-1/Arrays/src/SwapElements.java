public class SwapElements {
    public static void main(String[] args) {
        String[] orders = {"first", "second", "third"};
        int first = 0;
        int third = 2;
        String temporary = orders[0];
        orders[0] = orders[2];
        orders[2] = temporary;

        for (int i = 0; i < orders.length; i++){
        System.out.println(orders[i] + " ");
        }
        System.out.println();
    }
}
// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`