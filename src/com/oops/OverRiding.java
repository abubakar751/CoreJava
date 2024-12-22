package com.oops;
class  Parents {
    void show(){
        System.out.println("Parents class method ");
    }
        }
public class OverRiding  extends Parents{
    public static void main(String[] args) {

        Parents overRiding = new OverRiding();
        overRiding.show();
    }
        void show () {
            System.out.println("child class method ");
        }
    }
