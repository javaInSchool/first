public class Dispatcher {
    public static void main(String[] args) {
        int x = 7;
        int y = 0;
        int[] z = {1,2,3};
        try{
            System.out.println(x/y);
            System.out.println(z[3]);
        }catch(ArithmeticException ae){
            System.out.println("НЕ делите на 0!!!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Нет такого элемента!");
        }
    }
}