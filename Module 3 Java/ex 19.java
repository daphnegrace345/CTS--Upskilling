// Interface Implementation Program in Java

interface Playable {
    // Abstract method
    void play();
}
class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }
}

class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
}

class InterfaceImplementation {
    public static void main(String[] args) {

        // Creating objects
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        // Calling methods
        guitar.play();
        piano.play();
    }
}
