class Student {
     String name;
     int age;
     String rollnum;
     String house;

    public Student(String name, int age, String rollnum, String house) {
        this.name = name;
        this.age = age;
        this.rollnum = rollnum;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details : { name : "+name
                +" , age:"+ age
                +", rollnumber:"+ rollnum
                +", house : " + house + " }";
    }

    public static void main(String[] args) {
        Student stu = new Student("Sharique",19,"s01","sayal");
        System.out.println(stu);
    }
}
