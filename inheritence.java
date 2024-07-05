public class inheritence {
    static  class animal{
        int x ;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
    static class dog extends animal{
        public void bark(){
            System.out.println("barking");
        }
        public void eat(){
            System.out.println("eating");
        }

    }
    public static void main(String[] args) {
    dog d = new dog();
    d.bark();
    d.setX(44);
        System.out.println(d.getX());
    }
}
