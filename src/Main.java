import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//public class Main{
//    public static void main(String[] args) {
//        Car	car1 = new Car("Ford",19,"78943");
//        Car car2 = new Car("Mercedes",20,"54544");
//        Car car3 = new Car("BMW",14,"87685");
//
//        ArrayList<Car> carsArrayList = new ArrayList<>();
//        carsArrayList.add(car1);
//        carsArrayList.add(car2);
//        carsArrayList.add(car3);
//
//        Car f = getCarByAge(carsArrayList,20);
//        System.out.println(f);
//
//
//    }
//    public static Car getCarByAge(ArrayList<Car> list,int age){
//        Car res = null;
//        for(Car s:list){
//            if(s.getAge() == age){
//                res = s;
//            }
//        }
//        return res;
//    }
//}
//
//class Car{
//    String name;
//    int age;
//    String win;
//
//    public Car(String name,int age,String win){
//        this.name = name;
//        this.age = age;
//        this.win = win;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public String getWin(){
//        return win;
//    }
//    public void setWin(String win){
//        this.win = win;
//    }
//
//    public String toString(){
//        return "Name: "+name +" Age: "+age+" WinRace: "+win;
//    }
//}
//class SortByName implements Comparator<Car>{
//
//    @Override
//    public int compare(Car first, Car second) {
//        if(first.getName().compareTo(second.getName())==0){
//            if(first.getAge()== second.getAge()){
//                return 0;
//            }else if(first.getAge()>second.getAge()){
//                return -1;
//            }else{
//                return 1;
//            }
//        }
//        else if(first.getName().compareTo(second.getName())==1){
//            return 1;
//        }else{
//            return -1;
//        }
//
//    }
//}
//
//class SortByAge implements Comparator<Car>{
//
//    @Override
//    public int compare(Car first, Car second) {
//        if(first.getAge()==second.getAge()){
//            return 0;
//        }else if(first.getAge()>second.getAge()){
//            return 1;
//        }else{
//            return -1;
//        }
//    }
//}
//
//class SortByWin implements Comparator<Car>{
//
//    @Override
//    public int compare(Car first, Car second) {
//        return first.getWin().compareTo(second.getWin());
//    }
//}

//public class Main {
//    public static void main(String [] args){
//        ArrayList<Patient>patientArrayList = new ArrayList<>();
//        Patient pateient1 = new Patient(1, "Kenes", "Dias", "Mukhitzhnauly",  "Aiteke bi 176", "87021874596", 1282004,  "Cancer");
//        Patient pateient2 = new Patient(2, "Zhomart", "Ramazan", "Kurmangazyuly",  "Kazybek bi 23", "87725487856", 2572003,  "Asthma");
//
//
//        patientArrayList.add(pateient1);
//        patientArrayList.add(pateient2);
//
//        for (Patient s : patientArrayList){
//            if(s.getDiagnosis().equals("Asthma")){
//                System.out.println("patient with asthma: " + s);
//            }
//        }
//
//        for (Patient s : patientArrayList){
//            if (s.getMedCard() > 1500000 && s.getMedCard() < 2500000){
//                System.out.println(s.getName() + " " + s.getSurname() + ", Credit card: " + s.getMedCard());
//            }
//        }
//
//    }
//}
//
//class Patient {
//    int id;
//    String surname;
//    String name;
//    String middleName;
//    String adress;
//    String phoneNum;
//    int medCard;
//    String diagnosis;
//
//    public Patient(int id, String surname, String name, String middleName, String adress,
//                   String phoneNum, int medCard, String diagnosis) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.middleName = middleName;
//        this.adress = adress;
//        this.phoneNum = phoneNum;
//        this.medCard = medCard;
//        this.diagnosis = diagnosis;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }
//
//    public String getPhoneNum() {
//        return phoneNum;
//    }
//
//    public void setPhoneNum(String phoneNum) {
//        this.phoneNum = phoneNum;
//    }
//
//    public int getMedCard() {
//        return medCard;
//    }
//
//    public void setMedCard(int medCard) {
//        this.medCard = medCard;
//    }
//
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(String diagnosis) {
//        this.diagnosis = diagnosis;
//    }
//
//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", middleName='" + middleName + '\'' +
//                ", adress='" + adress + '\'' +
//                ", phoneNum='" + phoneNum + '\'' +
//                ", medCard=" + medCard +
//                ", diagnosis='" + diagnosis + '\'' +
//                '}';
//    }
//}


//class Patient {
//    private int id;
//    private String fName;
//    private String lName;
//    private String mName;
//    private String address;
//    private String pnumber;
//    private int med_card;
//    private String diagnosis;
//
//    public Patient(){
//        this.id = 0;
//        this.fName = "";
//        this.lName = "";
//        this.mName = "";
//        this.address = "";
//        this.med_card = 0;
//        this.pnumber = "";
//        this.diagnosis = "";
//    }
//
//    public Patient(int id, String fName, String mName, String lName,String address, String pnumber, int med_card, String diagnosis) {
//        this.id = id;
//        this.fName = fName;
//        this.lName = lName;
//        this.mName = mName;
//        this.address = address;
//        this.med_card = med_card;
//        this.pnumber = pnumber;
//        this.diagnosis = diagnosis;
//    }
//
//    void setId(int id){
//        this.id = id;
//    }
//
//    int getId(){
//        return id;
//    }
//
//    void setName(String fName){
//        this.fName =fName;
//    }
//
//    String getName(){
//        return fName;
//    }
//
//    void setlName(String lName){
//        this.lName = lName;
//    }
//
//    String getlName(){
//        return lName;
//    }
//
//    void setmName(String mName){
//        this.mName = mName;
//    }
//
//    String getmName(){
//        return mName;
//    }
//
//    void setAddress(String address){
//        this.address =address;
//    }
//
//    String getAddress(){
//        return address;
//    }
//
//    void setpnumber(String pnumber){
//        this.pnumber =pnumber;
//    }
//
//    String getpnumber(){
//        return pnumber;
//    }
//
//    void setMed_card(int med_card){
//        if(med_card>0) {
//            this.med_card = med_card;
//        } else System.out.println("Error");
//    }
//
//    int getMed_card(){
//        return med_card;
//    }
//
//    void setDiagnosis(String diagnosis){
//        this.diagnosis =diagnosis;
//    }
//
//    String getDiagnosis(){
//        return diagnosis;
//    }
//
//    @Override
//    public String toString() {
//        return "Patient --- " +
//                "id=" + id +
//                ", Last Name ='" + lName +
//                ", First Name =" + fName  +
//                ", Middle Name =" + mName +
//                ", Address ='" + address +
//                ", Phone Number ='" + pnumber +
//                ", Number of Medicine Card =" + med_card +
//                ", Diagnosis ='" + diagnosis;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Patient[] patients_list = patients_list();
//        System.out.print("Enter diagnosis for find out people : ");
//        String diagnosis = scanner.next();
//        check_diagnosis(patients_list, diagnosis);
//        System.out.println("Enter diapason for find med card : ");
//        System.out.print("From : ");
//        int a = scanner.nextInt();
//        System.out.print("Till : ");
//        int b = scanner.nextInt();
//        check_med_card(patients_list, a, b);
//    }
//
//    static Patient[] patients_list(){
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Enter patients number : ");
//        Patient[] patients = new Patient[scanner1.nextInt()];
//        for (int i=0; i<patients.length; i++) {
//            patients[i]=new Patient();
//            System.out.println();
//            System.out.print("Enter ID : ");
//            patients[i].setId(scanner1.nextInt());
//            System.out.print("Enter Last Name: ");
//            patients[i].setlName(scanner1.next());
//            System.out.print("Enter First Name: ");
//            patients[i].setName(scanner1.next());
//            System.out.print("Enter Middle Name: ");
//            patients[i].setmName(scanner1.next());
//            System.out.print("Enter Address : ");
//            patients[i].setAddress(scanner1.next());
//            System.out.print("Enter Phone Number : ");
//            patients[i].setpnumber(scanner1.next());
//            System.out.print("Enter number of medicine card : ");
//            patients[i].setMed_card(scanner1.nextInt());
//            System.out.print("Enter diagnosis : ");
//            patients[i].setDiagnosis(scanner1.next());
//        }
//        return patients;
//    }
//
//    static Patient[] pat(){
//        Patient[] mass= new Patient[3];
//
//        mass[1]= new Patient(1,"Dias","Bolatuly","Orisbek","11.56.58","87077988654",14267,"Headache");
//        mass[2]= new Patient(2,"Dias","Bolatuly","Orisbek","11.56.58","87077988654",14267,"Stomach Ache");
//
//        return mass;
//    }
//
//    static void check_diagnosis(Patient[] patients,String diagnosis){
//        for(Patient patient:patients){
//            if(patient.getDiagnosis().equals(diagnosis)){
//                System.out.println(patient.toString());
//            }
//        }
//        System.out.println();
//    }
//
//    static void check_med_card(Patient[] patients,int a, int b){
//        for(Patient patient:patients){
//            if(patient.getMed_card()>=a && patient.getMed_card()<=b){
//                System.out.println(patient.toString());
//            }
//        }
//    }
//}

//public class Main {
//    public static void main(String [] args){
//        ArrayList<Car> carArrayList = new ArrayList<>();
//        Car car1 = new Car(1, "BMW", "e39", 1997, "black", 14000, "6458562");
//        Car car2 = new Car(2, "Mercedes", "s63", 2020, "white", 30000, "784512");
//
//
//        carArrayList.add(car1);
//        carArrayList.add(car2);
//
//
//
//        for (Car s : carArrayList){
//            if (s.stamp.equals("Mercedes")){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.stamp.equals("Mercedes") && s.yearRelease < 2021){
//                System.out.println(s);
//            }
//        }
//
//
//        for (Car s : carArrayList){
//            if (s.yearRelease == 2002 && s.price > 100){
//                System.out.println(s);
//            }
//        }
//    }
//}
//
//class Car{
//    int id;
//    String stamp;
//    String model;
//    int yearRelease;
//    String color;
//    int price;
//    String registrationNum;
//
//    public Car(int id, String stamp, String model, int yearRelease, String color, int price, String registrationNum){
//        this.id = id;
//        this.stamp = stamp;
//        this.model = model;
//        this.yearRelease = yearRelease;
//        this.color = color;
//        this.price = price;
//        this.registrationNum = registrationNum;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getStamp() {
//        return stamp;
//    }
//
//    public void setStamp(String stamp) {
//        this.stamp = stamp;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getYearRelease() {
//        return yearRelease;
//    }
//
//    public void setYearRelease(int yearRelease) {
//        this.yearRelease = yearRelease;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getRegistrationNum() {
//        return registrationNum;
//    }
//
//    public void setRegistrationNum(String registrationNum) {
//        this.registrationNum = registrationNum;
//    }
//    public String toString() {
//        String result = "\nid: " + id + "  Stemp: " + stamp + "  Model: " + model + "  Year Release: " + yearRelease+"  Color: "+color+"  Price: "+price+"  Registration number: "+registrationNum;
//        return result;
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Train> TrainList = new ArrayList<>();
//        Train Train= new Train("Dias" ,"Orisbek","Bolat",2004,"87771233456","Design",3,"3e");
//        Train Train1 = new Train("Alnur" ,"Rysbek","Bolat",2005,"87452342344","Java",3,"3e");
//
//
//        TrainList.add(Train);
//        TrainList.add(Train1);
//
//
//        for (Train f : TrainList) {
//            if (f.getBirth()<=2005){
//                System.out.println(f);
//            }
//            if (f.getBirth()>2005){
//                break;
//            }
//        }
//    }
//}
//
//class Train{
//    String name;
//    String surname;
//    String patro;
//    int birth;
//    String Train;
//    String faculty;
//    int course;
//    String group;
//
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getSurname() {
//        return surname;
//    }
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//    public String getPatro() {
//        return patro;
//    }
//    public void setPatro(String patro) {
//        this.patro = patro;
//    }
//    public int getBirth() {
//        return birth;
//    }
//    public void setBirth(int birth) {
//        this.birth = birth;
//    }
//    public String getTrain() {
//        return Train;
//    }
//    public void setTrain(String Train) {
//        this.Train = Train;
//    }
//    public String getFaculty() {
//        return faculty;
//    }
//    public void setFaculty(String faculty) {
//        this.faculty = faculty;
//    }
//    public int getCourse() {
//        return course;
//    }
//    public void setCourse(int course) {
//        this.course = course;
//    }
//    public String getGroup() {
//        return group;
//    }
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//
//    public Train(String name,String surname,
//                 String patro,int birth,
//                 String Train,String faculty,
//                 int course,String group) {
//        this.name = name;
//        this.surname = surname;
//        this.birth = birth;
//        this.Train = Train;
//        this.faculty = faculty;
//        this.course = course;
//        this.group = group;
//    }
//    @Override
//    public String toString() {
//        return "Train(" +
//                "name:" + name +
//                ", age:" + surname +
//                ", link:" + birth +
//                ", rating:" + Train +
//                ", age:" + faculty +
//                ", link:" + course +
//                ", rating:" + group +
//                ")";
//
//    }
//}
//
//class sortNameTrain implements Comparator<Train> {
//    @Override
//    public int compare(Train s1, Train s2){
//        return s1.getName().compareTo(s2.getName());
//    }
//}