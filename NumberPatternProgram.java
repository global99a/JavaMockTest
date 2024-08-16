class NumberPatternProgram {
    public static void main(String[] a) {
        int num = 8;
        for (int i = 1; i <= 8; i *= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num * i - 1 + j + " ");
            }
            System.out.println("");
        }
    }
}
