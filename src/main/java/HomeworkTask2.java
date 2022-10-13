public class HomeworkTask2 {
    public static void main(String[] args) {
    MathOperations m = new MathOperations();
    m.add(2,2);
    m.sub(2,2);
    m.mult(2,2);
    m.div(2,2);
        System.out.println(m.getAddition());
        System.out.println(m.getSubtraction());
        System.out.println(m.getMultiplication());
        System.out.println(m.getDivision());
    }
}
