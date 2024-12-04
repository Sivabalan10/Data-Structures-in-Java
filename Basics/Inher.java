class Nokia_1 {
    void layout() {
        System.out.println("Screen layout");
    }
}

class Nokia_2 extends Nokia_1 {
    void flash_light() {
        System.out.println("Flash Light at back");
    }
}

class Nokia_pro extends Nokia_2 {
    void camera() {
        System.out.println("Access camera!");
    }
}

class Grandpa {
    void hair() {
        System.out.println("Curly");
    }
}

class Sister extends Grandpa {
    void color() {
        System.out.println("White");
    }
}

class Brother extends Grandpa {
    void color() {
        System.out.println("brown");
    }
}

public class Inher {

    public static void main(String[] args) {
        // single
        Nokia_2 nokia = new Nokia_2();
        nokia.layout();
        nokia.flash_light();

        // multiple
        Nokia_pro pro = new Nokia_pro();
        pro.camera();
        pro.flash_light();
        pro.layout();

        // hierarchical
        Sister sis = new Sister();
        Brother bro = new Brother();
        sis.color();
        sis.hair();
        bro.color();
        bro.hair();
    }
}
