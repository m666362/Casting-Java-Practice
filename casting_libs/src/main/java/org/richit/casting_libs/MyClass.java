package org.richit.casting_libs;

public class MyClass {

    private static void startProgramme() {
        String start = "Programme started";
        String dot = "----------------";
        System.out.println("");
        System.out.println(dot+start+dot);
        System.out.println("");
    }
    public static void endProgramme(){

        String dot = "----------------";
        String end = "Programme ended";
        System.out.println("");
        System.out.println(dot+end+dot);
        System.out.println();
    }

    public static void main(String[] args) {

        startProgramme();

        normalCasting();
        upCasting();
        downCasting();
        castingThatDoesntWork();

        endProgramme();
    }

    //todo: code for castingThatDoesntWork()
    private static void castingThatDoesntWork() {

    }

    //todo: code for downCasting()
    private static void downCasting() {

    }

    //todo: code for upCasting()
    private static void upCasting() {

    }

    //todo: code for normalCasting()
    public static void normalCasting(){
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();
        machine1.start();
        camera1.start();
        camera1.snap();
    }


}
