package org.richit.casting_libs;

public class MyClass {

    static String dot = "----------------";
    private static void startProgramme() {
        String start = "Programme started";
        System.out.println("");
        System.out.println(dot+start+dot);
        System.out.println("");
    }
    public static void endProgramme(){

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

    //todo: code for normalCasting()
    public static void normalCasting(){

        System.out.println(dot+" Normalcasting " + dot);
        Machine normalCastingMachine = new Machine();
        normalCastingMachine.start();
        normalCastingMachine.engine();
        //todo: that doesn't work
        //normalCastingMachine.snap();

        Camera normalCastingCamera = new Camera();
        normalCastingCamera.start();
        normalCastingCamera.snap();
        normalCastingCamera.engine();

        System.out.println();
    }

    //todo: code for upCasting()
    private static void upCasting()
    {

        System.out.println(dot+ " Up Casting " + dot);
        Machine upCastingMachine = new Camera();
        upCastingMachine.start();
        upCastingMachine.engine();
        ((Camera)upCastingMachine).snap(); // because of (Camera) which means Camera class
        //todo: this doesn't work
        //upCastingMachine.snap();

        System.out.println();
    }

    //todo: code for downCasting()
    private static void downCasting() {

        System.out.println(dot + "Down casting " + dot);
        Machine downCastingMachine = new Camera();//like upcasting

        downCastingMachine.start();
        downCastingMachine.engine();
        ((Camera)downCastingMachine).snap();// because of (Camera)
        //todo: that doesn't work
        //downCastingMachine.snap();

        Camera downCastingCamera = (Camera) downCastingMachine;
        //its difficult to understand, but works like normal casting
        downCastingCamera.start();
        downCastingCamera.snap();
        downCastingCamera.engine();

    }

    //todo: code for castingThatDoesntWork()
    private static void castingThatDoesntWork( ) {

        System.out.println(dot + "Casting doesn't work " + dot);
        System.out.println();
        System.out.println("Machine castnotworkMachine = new Machine();//like normal casting work");
        System.out.println("Camera castnotworkCamera1 = (Camera) new Machine();//doesn't work");
        System.out.println("Camera castnotworkCamera2 = (Camera) castnotworkMachine;//doesn't work");

    }


}
