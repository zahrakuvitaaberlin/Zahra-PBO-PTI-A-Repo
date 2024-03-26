public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private int siswa;

    //jawaban nomor 1: tardapat kesalahan pada penulisan "student" karena  tidak sama dengan yang classnya yang benar adalah "Student"
    public Student(){
        name = "";
        address = "";
        age = 0;
    }
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
    }
     // jawaban nomor 2
     public Student(int math, int science, int english) {
        mathGrade = math;
        scienceGrade = science;
        englishGrade = english;
    }
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(int math){
        mathGrade = math;
    }
    public void setEnglish(int english){
        englishGrade = english;
    }
    public void setScience(int science){
        scienceGrade = science;
    }
    private double getAverage(){
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }
// nomor 3
    public boolean statusAkhir(){
        return getAverage() >= 61;
    }
//no 5
    public static void jumlahObjek(int siswa) {
        System.out.println("jumlah siswa : " + siswa);
    } 
        
   
    public void displayMessage(){
    System.out.println("Siswa dengan nama "+name);
    System.out.println("beramalat di "+address);
    System.out.println("berumur "+age);
    System.out.println("mempunyai nilai rata rata"+getAverage());
    System.out.println("Status Akhir: " + (statusAkhir() ? "Lolos" : "Remidi"));
    }
}
