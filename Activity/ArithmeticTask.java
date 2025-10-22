package Activity;
//Tasksheet1-1-2 

class ArithmeticTask {

    public static void main(String[] args) {
        //(result = result * 2 to result -= 1;) compound assignment   

        int result = 1 + 2;// sum is 3 to get the value of result
        System.out.println(result);

        result -= 1; // result - 1 = 2
        System.out.println(result);

        result *= 2; // 2 * 2 = 4
        System.out.println(result);

        result /= 2; // 4 / 2 = 2
        System.out.println(result);

        result += 8; //2 + 8 = 10 (no display but has an answer)
        result %= 7; //10 % 7 = 3
        System.out.println(result);
    }
}
