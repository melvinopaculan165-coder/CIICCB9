public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {
            951, 402, 994, 851, 360, 63, 408, 319, 601, 485, 380, 507, 725, 547, 544,
            615, 83, 165, 141, 501, 263, 617, 865, 575, 218, 380, 994, 522, 236, 105, 942, 941,
            386, 462, 47, 413, 907, 344, 236, 375, 523, 666, 537, 378, 329, 615, 353, 345,
            399, 162, 759, 219, 318, 237, 412, 666, 826, 248, 866, 950, 626, 949, 687, 217,
            815, 67, 104, 53, 512, 24, 892, 994, 767, 553, 91, 378, 843, 831, 445, 742, 717,
            859, 609, 842, 451, 688, 753, 954, 885, 93, 857, 440, 380, 726, 721, 329, 753, 470, 743, 527
        };
        java.util.Arrays.stream(numbers)            //This converts the int[] array into an IntStream.
            .takeWhile(n -> n != 237)               //operation iterates through the stream and keeps elements as long as this predicate is true.
                                                    //This is the key method for solving the "stop after" requirement.
            .forEach(n -> System.out.println(n));   //This is the terminal operation.

    }
}     