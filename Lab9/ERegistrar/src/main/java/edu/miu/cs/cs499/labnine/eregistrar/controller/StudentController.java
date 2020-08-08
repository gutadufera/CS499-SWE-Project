package edu.miu.cs.cs499.labnine.eregistrar.controller;

import edu.miu.cs.cs499.labnine.eregistrar.model.Student;
import edu.miu.cs.cs499.labnine.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/secure/student/list")
    public ModelAndView displayListOfStudents(){
        List<Student> students = studentService.getAllStudents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students", students);
        modelAndView.addObject("searchString", "");
        modelAndView.addObject("studentsCount", students.size());
        modelAndView.setViewName("secure/student/list");
        return modelAndView;
    }

    @GetMapping("/secure/student/new")
    public String displayNewStudentForm(Model model){
        model.addAttribute("student", new Student());
        return "secure/student/new";
    }
    @PostMapping("/secure/student/new")
    public String addNewStudent(@Valid @ModelAttribute("student") Student student,
                                BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "/secure/student/new";
        }
        System.out.println(student.getEnrollmentDate());
        student = studentService.saveStudent(student);
        return "redirect:/secure/student/list";
    }

    @GetMapping(value = {"/student/delete/{studentId}"})
    public String deleteStudent(@PathVariable Long studentId, Model model) {
        studentService.deleteStudentByID(studentId);
        return "redirect:/secure/student/list";
    }

    @PostMapping(value = {"/secure/student/edit", "/student/edit"})
    public String updateStudent(@Valid @ModelAttribute("student") Student student,
                                BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "student/edit";
        }
        student = studentService.saveStudent(student);
        return "redirect:/secure/student/list";
    }
    @GetMapping("/student/edit/{id}")
    public String updateFrom(@PathVariable("id") long id, Model model){
        Student student= studentService.getStudentById(id);
        model.addAttribute("student",student);
        return "secure/student/update";
    }
//
//    @GetMapping(value = {"/eregistrar/student/search", "/student/search"})
//    public ModelAndView searchStudents(@RequestParam String searchString) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("searchString", searchString);
//        modelAndView.setViewName("student/list");
//        return modelAndView;
//    }
}
