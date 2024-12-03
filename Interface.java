interface spotify {
    void play(); // abstract class
}

class Sad implements spotify {
    @Override
    public void play() {
        System.out.println("Playing Sad songs....");
    }
}

class Happy implements spotify {
    @Override
    public void play() {
        System.out.println("Playing Happy songs....");
    }
}

// multiple inheritance
interface A {
    void name();
}

interface B {
    void name();
}

class C implements A, B {
    @Override
    public void name() {
        System.out.println("Class c");
    }
}

class Interface {
    public static void main(String[] args) {
        // Basic implementation
        Sad sad = new Sad();
        Happy hap = new Happy();
        sad.play();
        hap.play();

        // multiple inheritance
        C obj = new C();
        obj.name(); // no diamond problem
    }
}