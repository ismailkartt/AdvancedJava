package AdvancedJavaPratic.classes.interfaces;

public class SchoolManagement {
    /*Task: Okul yönetimi için öğrenci ve öğretmen kayıtlarını
   -oluşturan
   -görüntüleyen
   -güncelleyen
   -silen
   bir program yazınız.

  Her iki sınıf için aynı methodlara ihtiyacımız var(add,delete...).
  implement edip bu methodları oluşturabilmek  ve her iki classın nesnelerini
  parametre olarak alabilmek için generic tipte
  interface tanımladık.

 */
    public static void main(String[] args) {
        Student student = new Student("Tolstoy");
        StudentRepo studentRepo = new StudentRepo();

        Teacher teacher=new Teacher("Dostoyevski");
        TeacherRepo teacherRepo = new TeacherRepo();

        studentRepo.add(student);
        studentRepo.update(student);
        studentRepo.get(student);
        studentRepo.delete(student);
        System.out.println();
        teacherRepo.add(teacher);
        teacherRepo.update(teacher);
        teacherRepo.get(teacher);
        teacherRepo.delete(teacher);

    }

}
