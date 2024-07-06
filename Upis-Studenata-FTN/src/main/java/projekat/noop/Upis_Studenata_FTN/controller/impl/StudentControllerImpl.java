package projekat.noop.Upis_Studenata_FTN.controller.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projekat.noop.Upis_Studenata_FTN.repository.StudentRepository;
import projekat.noop.Upis_Studenata_FTN.model.Student;
import projekat.noop.Upis_Studenata_FTN.service.StudentService;
import org.springframework.ui.Model;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class StudentControllerImpl {

    @Autowired
    private final StudentService studentService;

    public StudentControllerImpl(final StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/studenti")
    public List<Student> getStudenti() {
        return studentService.getAllStudents();
    }

    @PostMapping(value = "/post")
    public Student createStudent(Integer ID, String BR_INDEKSA, String IME, String PREZIME, String DATUM_RODJENJA, String POL, String BRACNI_STATUS, String RADNI_STATUS, String ADRESA, String DRZAVLJANSTVO ) {
        try {
            Student student = new Student();
            student.setBR_INDEKSA(BR_INDEKSA);
            student.setIME(IME);
            student.setPREZIME(PREZIME);
            student.setDATUM_RODJENJA(DATUM_RODJENJA);
            student.setPOL(POL);
            student.setBRACNI_STATUS(BRACNI_STATUS);
            student.setRADNI_STATUS(RADNI_STATUS);
            student.setADRESA(ADRESA);
            student.setDRZAVLJANSTVO(DRZAVLJANSTVO);
            return studentService.saveStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @PutMapping(value = "/put/{ID}")
    public Student updateStudent(@PathVariable Integer ID, String BR_INDEKSA, String IME, String PREZIME, String DATUM_RODJENJA, String POL, String BRACNI_STATUS, String RADNI_STATUS, String ADRESA, String DRZAVLJANSTVO) {
        return studentService.updateStudent(ID,BR_INDEKSA, IME, PREZIME, DATUM_RODJENJA, POL, BRACNI_STATUS, RADNI_STATUS, ADRESA, DRZAVLJANSTVO);
    }

    @GetMapping(value = "/")
    public String homePage() {
        return "home_page";
    }

    @GetMapping(value = "/Studenti")
    public String studenti(Model model) {
        List<Student> studenti = studentService.getAllStudents();
        model.addAttribute("studenti", studenti);
        return "studenti";
    }

    @GetMapping(value = "/Unos")
    public String unos(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "unos_studenata";
    }

    @PostMapping(value = "/Studenti")
    public String unos1(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/Studenti";
    }

    @GetMapping(value = "/{ID}")
    public String editStudent(@PathVariable Integer ID, Model model) {
        model.addAttribute("student", studentService.getStudentByID(ID));
        return "update";
    }

    @PostMapping(value = "/Studenti/{ID}")
    public String editStudent1(@PathVariable Integer ID, @ModelAttribute("student") Student student) {
        Student postojeciStudent = studentService.getStudentByID(ID);
        postojeciStudent.setID(ID);
        postojeciStudent.setBR_INDEKSA(student.getBR_INDEKSA());
        postojeciStudent.setIME(student.getIME());
        postojeciStudent.setPREZIME(student.getPREZIME());
        postojeciStudent.setDATUM_RODJENJA(student.getDATUM_RODJENJA());
        postojeciStudent.setPOL(student.getPOL());
        postojeciStudent.setBRACNI_STATUS(student.getBRACNI_STATUS());
        postojeciStudent.setRADNI_STATUS(student.getRADNI_STATUS());
        postojeciStudent.setADRESA(student.getADRESA());
        postojeciStudent.setDRZAVLJANSTVO(student.getDRZAVLJANSTVO());
        studentService.updateStudent(postojeciStudent);
        return "redirect:/Studenti";
    }

    @GetMapping(value = "/delete/{ID}")
    public String deleteStudent(@PathVariable Integer ID) {
        studentService.deleteStudentById(ID);
        return "redirect:/Studenti";
    }
}
