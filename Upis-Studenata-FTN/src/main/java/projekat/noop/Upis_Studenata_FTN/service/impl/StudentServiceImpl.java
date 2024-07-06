package projekat.noop.Upis_Studenata_FTN.service.impl;

import org.apache.hadoop.mapreduce.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import projekat.noop.Upis_Studenata_FTN.model.Student;
import projekat.noop.Upis_Studenata_FTN.repository.StudentRepository;
import projekat.noop.Upis_Studenata_FTN.service.StudentService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private final StudentRepository studentRepository;
    public StudentServiceImpl (final StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

//    @Override
//    public Student updateStudent(Integer ID, String BR_INDEKSA, String IME, String PREZIME, String DATUM_RODJENJA, String POL, String BRACNI_STATUS, String RADNI_STATUS, String ADRESA, String DRZAVLJANSTVO) {
//        return studentRepository.findById(ID)
//                .orElseThrow();
//    }

    @Override
    public Student updateStudent(@PathVariable Integer ID, String BR_INDEKSA, String IME, String PREZIME, String DATUM_RODJENJA, String POL, String BRACNI_STATUS, String RADNI_STATUS, String ADRESA, String DRZAVLJANSTVO) {
        Student student = studentRepository.findById(ID).get();
        student.setBR_INDEKSA(BR_INDEKSA);
        student.setIME(IME);
        student.setPREZIME(PREZIME);
        student.setDATUM_RODJENJA(DATUM_RODJENJA);
        student.setPOL(POL);
        student.setBRACNI_STATUS(BRACNI_STATUS);
        student.setRADNI_STATUS(RADNI_STATUS);
        student.setADRESA(ADRESA);
        student.setDRZAVLJANSTVO(DRZAVLJANSTVO);
        studentRepository.save(student);
        return student;
    }

    @Override
    public Student saveStudent1(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentByID(Integer ID) {
        return studentRepository.findById(ID).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Integer ID) {
        studentRepository.deleteById(ID);
    }

}
