package org.richit.casting_libs;

public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("@Override");
        super.start();
        System.out.println("Camera stated after machine ");
        System.out.println();
    }

    public void snap(){
        System.out.println("Photo taken");
    }

}
