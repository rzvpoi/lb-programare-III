package proiect;

import java.util.Objects;
import java.util.regex.Pattern;

public class Student extends Persoana {
    public String facultate;
    public String specializare;
    public Integer anFacultate;
    public Integer energie;

    private Student(String nume, String cnp, String sex, Integer an, Integer luna, Integer zi, String facultate, String specializare, Integer anFacultate, Integer energie) {
        super(nume, cnp, sex, anFacultate, luna, zi);
        this.facultate = facultate;
        this.specializare = specializare;
        this.anFacultate = anFacultate;
        this.energie = energie;
    }

    public static String getInstance(String nume, String cnp, String facultate, String specializare, Integer anFacultate) {
        String err = isNameValid(nume);
        if (err != null )
            return "ERROR: "+err;
        Persoana response = isCnpValid(cnp);
        if (response.zi == null){
            return null;
        }
        err = isDateValid(response.an, response.luna, response.zi);
        if (err != null){
            return "ERROR: "+err;
        }

        err = isStudentValid(facultate,specializare);
        if (err != null )
            return "ERROR: "+err;
        
        Student stud = new Student(nume, cnp, response.sex, response.an, response.luna, response.zi, facultate, specializare, anFacultate, 100);
        count++;
        return stud.toString();
    }

    private static String isStudentValid(String facultate, String specializare){

        if (Pattern.matches("[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]", facultate) == true  ) {return "Facultate contains special chars!";}
        if (Pattern.matches("[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]", specializare) == true  ) {return "Specializare contains special chars!";}

        return null;
    }

    public String getFacultate() {
        return this.facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getSpecializare() {
        return this.specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public Integer getAnFacultate() {
        return this.anFacultate;
    }

    public void setAnFacultate(Integer anFacultate) {
        this.anFacultate = anFacultate;
    }

    public Integer getEnergie() {
        return this.energie;
    }

    public void setEnergie(Integer energie) {
        this.energie = energie;
    }


    @Override
    public String toString() {
        return "{" +
            " facultate='" + getFacultate() + "'" +
            ", specializare='" + getSpecializare() + "'" +
            ", an='" + getAn() + "'" +
            ", energie='" + getEnergie() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(facultate, student.facultate) && Objects.equals(specializare, student.specializare) && Objects.equals(an, student.an) && Objects.equals(energie, student.energie);
    }

}
