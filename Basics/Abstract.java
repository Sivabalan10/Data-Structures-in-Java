
abstract class Options {
    abstract void country();
}

class User extends Options {
    public void 
    country(){
        System.out.println("India");
    }
}

class Abstract {
    public static void main(String[] args) {
        User user1 = new User();
        user1.country();
    }
}
