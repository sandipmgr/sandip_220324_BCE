public class MyStudent {
    private String name;
    private String phone;
    private String address;
    public static void main(String[] args){
        MyStudent studentObject = new MyStudent();
        System.out.println("First Output:");
        System.out.println(studentObject.name+studentObject.phone+studentObject.address+"\n");
        System.out.println("Second Output:");
        System.out.println(studentObject.name+"\n"+studentObject.phone+"\n"+studentObject.address+"\n");
        System.out.println("Third Output:");
        System.out.println(studentObject.name+" "+studentObject.phone+" "+studentObject.address+"\n");

    }
}
//new commit
