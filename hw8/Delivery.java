package hw8;

class Delivery {
    static void main() {
        System.out.println(variants(6));
    }

    static int variants(int n) {
        if (n == 1) {
            return 1;
        } else if (n >= 1) {
            return n * variants(n-1);
        }
        return n;
    }
}
// recursion is worse because it takes too much memory,
// as well as stack space (e.g. StackOverflowError),
// recursion is usually slower,
// recursion is overall harder to comprehend than loops (with which any recursive method is possible to make)