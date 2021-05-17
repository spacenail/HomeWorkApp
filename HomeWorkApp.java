public class HomeWorkApp {
    public static void main(String[] args) {

    }
    static boolean firstMethod(int a, int b){
        if((a + b >= 10) && (a + b <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    static void secondMethod(int a){
        if(a >= 0){
            System.out.println("Число а=" + a +" положительное");
        } else {
            System.out.println("Число а=" + a +" отрицательное");
        }
    }
}
