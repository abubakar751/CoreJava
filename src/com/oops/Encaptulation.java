package com.oops;
class Test{
    private  int id;
    private boolean empty;

    public  void  setId(int id){
        this.id=id;
    }
    public int getId(){
        return  id;

    }
    public void setEmpty(boolean empty){
        this.empty=empty;
    }
    public boolean getEmpty(){
        return empty;
    }
    public String  toString(){

      
return  getEmpty()+" "+getId();
    }
}
public class Encaptulation {
    public static void main(String[] args) {
        Test test = new Test();
        test.setEmpty(false);
        test.setId(20);
        System.out.println(test);
    }
}
