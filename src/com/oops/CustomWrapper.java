package com.oops;

public class CustomWrapper {
    private int i;
    CustomWrapper(int i){
        this.i = i;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;

    }
    public String toString(){
        return Integer.toString(i);
    }
    public static void main(String[] args) {
        CustomWrapper conWrapper = new CustomWrapper(10);
        System.out.println(conWrapper.getI());

    }
}
