package proiect;

import java.time.Year;
import java.util.Objects;
import java.util.regex.Pattern;

public class Persoana {
    
    public String nume;
    public String cnp;
    public String sex;
    public Integer an;
    public Integer luna;
    public Integer zi;
    public static Integer count=0;

    protected Persoana(String nume, String cnp, String sex, Integer an, Integer luna, Integer zi) {
        this.nume = nume;
        this.cnp = cnp;
        this.sex = sex;
        this.an = an;
        this.luna = luna;
        this.zi = zi;
    }

    public static Persoana getInstance(String nume,String cnp) {
    
        String err = isNameValid(nume);
        if (err != null ){
            System.out.println(err);
            return null;
        }
        Persoana response = isCnpValid(cnp);
        if (response.zi == null){
            return null;
        }
        err = isDateValid(response.an, response.luna, response.zi);
        if (err != null){
            System.out.println(err);
            return null;
        }
    
        Persoana pers = new Persoana(nume, cnp , response.sex, response.an, response.luna, response.zi);
        count++;
        System.out.println(pers.toString());
        return  pers;
    }

    protected static String isNameValid(String nume) {
        if (nume == null || nume.isEmpty()) {return "Name is null!";}
        if (Pattern.matches("[a-zA-Z ]+", nume) == false  ) {return "Name doesnt contains only letters!";}
        if (Pattern.matches("[~!@#$%^&*()_+{}\\[\\]:;,.<>/?-]", nume) == true  ) {return "Name contains special chars!";}
        
        String[] words = nume.split("\\s+");
        if(words.length < 1 || words.length > 3) {return "A name must contain between 1 and 3 words!";}
        for (String word : words) {
            if(word.length() < 3 || word.length() > 15 ) {return "A name must contain between 3 and 15 characters per word!";}
        }

        return null;
    }

    protected static String isDateValid(Integer an, Integer luna, Integer zi){
        if(an > Year.now().getValue()-14 || an < (Year.now().getValue() - 100)) return "Year is not correct!";
        if(luna < 1 || luna > 12) return "Month is not correct!";
        if(zi < 1 || zi > 31) return "Day is not correct!";

        return null;
    }    

    protected static Persoana isCnpValid(String cnp) {
        Persoana pers = new Persoana("", "", "", null, null, null);

        if (cnp == null || cnp.isEmpty()) {System.out.println("Cnp is empty!");return pers;};

        if (cnp.length() != 13) {System.out.println("Cnp length is wrong!");return pers;}

        if (Pattern.matches("[0-9]+", cnp) == false  ) {System.out.println("Cnp must contain only numbers!");return pers;}

        if(cnp.charAt(0) == '2' || cnp.charAt(0) == '6'){
            pers.sex = "F";
        } else if(cnp.charAt(0) == '5' || cnp.charAt(0) == '1'){
            pers.sex = "M";
        } else {System.out.println("CNP first letter is wrong!");return pers;}

        int cnpAn = Integer. parseInt(cnp.substring(1, 3));
        if ( cnpAn >= 0) pers.an = 2000+cnpAn;
        else pers.an = 1900+cnpAn;
        pers.luna =Integer. parseInt(cnp.substring(3, 5));
        pers.zi = Integer. parseInt(cnp.substring(5, 7));
         
        return pers;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return this.cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAn() {
        return this.an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public Integer getLuna() {
        return this.luna;
    }

    public void setLuna(Integer luna) {
        this.luna = luna;
    }

    public Integer getZi() {
        return this.zi;
    }

    public void setZi(Integer zi) {
        this.zi = zi;
    }


    @Override
    public String toString() {
        return "{" +
            " nume='" + getNume() + "'" +
            ", cnp='" + getCnp() + "'" +
            ", sex='" + getSex() + "'" +
            ", an='" + getAn() + "'" +
            ", luna='" + getLuna() + "'" +
            ", zi='" + getZi() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persoana)) {
            return false;
        }
        Persoana persoana = (Persoana) o;
        return Objects.equals(nume, persoana.nume) && Objects.equals(cnp, persoana.cnp) && Objects.equals(sex, persoana.sex) && Objects.equals(an, persoana.an) && Objects.equals(luna, persoana.luna) && Objects.equals(zi, persoana.zi);
    }

}
