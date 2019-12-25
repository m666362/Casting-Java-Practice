package org.richit.casting_libs;

public class Camera extends Machine {

    @Override
    public void start() {
        super.start();
        System.out.println("Camera stated");
    }

    public void snap(){
        System.out.println("Photo taken");
    }

}
