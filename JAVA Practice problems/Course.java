class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }
    void enrollStudents(String studentName ) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }
    void unnrolledStudents() {
        System.out.println("STUDENT REMOVE");
        enrollments--;
    }
}