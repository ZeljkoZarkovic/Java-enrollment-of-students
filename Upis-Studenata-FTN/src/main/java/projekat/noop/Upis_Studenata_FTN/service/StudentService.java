package projekat.noop.Upis_Studenata_FTN.service;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import projekat.noop.Upis_Studenata_FTN.model.Student;

import java.util.Date;
import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(@RequestBody Student student);

    Student updateStudent(Integer ID, String BR_INDEKSA, String IME, String PREZIME, String DATUM_RODJENJA, String POL, String BRACNI_STATUS, String RADNI_STATUS, String ADRESA, String DRZAVLJANSTVO);

    Student saveStudent1(Student student);

    Student getStudentByID(Integer ID);

    Student updateStudent(Student student);

    void deleteStudentById(Integer ID);
}
