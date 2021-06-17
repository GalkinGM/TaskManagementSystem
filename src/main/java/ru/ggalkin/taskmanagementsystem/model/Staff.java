package ru.ggalkin.taskmanagementsystem.model;




import lombok.Getter; // Автогенерация геттеров
import lombok.Setter; // Автогенерация сеттеров

import javax.persistence.Column; //используется для указания сведений о столбце, с которым связано поле или свойство.
import javax.persistence.Entity; //говорит Hibernate о том, что этот класс является сущностью
import javax.persistence.GeneratedValue; //позволяет задать несколько различных способов генерации этого идентификатора
import javax.persistence.Id; //указывает на то поле, которое является уникальным идентификатором сущности
import javax.persistence.Table; //позволяет указать название таблицы в БД, которая связана с этой сущностью

@Entity
@Table(name = "Staff")
@Getter
@Setter
public class Staff {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "staff_name")
    private String staff_name;

    @Column(name = "staff_surname")
    private String staff_surname;

    @Column(name = "staff_secondName")
    private String staff_secondName;

    @Column(name = "staff_fio")
    private String staff_fio;

    @Column(name = "DOB")
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private LocalDate dob;
    private String dob;

    @Column(name = "hired_Date")
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private LocalDate hiredDate;
    private String hiredDate;

    @Column(name = "Department")
    private String department;

    @Column(name = "useremail")
    private String useremail;

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }



	@Column(name = "picture")
	private String picture;

    public Staff() {
        super();
    }


	public Staff(int id, String staff_name, String staff_surname, String staff_secondName, String staff_fio, String dob, String hiredDate, String department, String picture) {
        super();
        this.id = id;
        this.staff_name = staff_name;
        this.staff_surname = staff_surname;
        this.staff_secondName =staff_secondName;
        this.staff_fio =staff_fio;
        this.dob = dob;
        this.hiredDate = hiredDate;
        this.department = department;
		this.picture = picture;
    }



//    public String getStaff_name() {
//        return staff_name;
//    }
//
//    public void setStaff_name(String staff_name) {
//        this.staff_name = staff_name;
//    }
//
//    public String getStaff_surname() {
//        return staff_surname;
//    }
//
//    public void setStaff_surname(String staff_surname) {
//        this.staff_surname = staff_surname;
//    }
//
//    public String getStaff_secondName() {
//        return staff_secondName;
//    }
//
//    public void setStaff_secondName(String staff_secondName) {
//        this.staff_secondName = staff_secondName;
//    }
//
//    public String getStaff_fio() {
//        return staff_fio;
//    }
//
//    public void setStaff_fio(String staff_fio) {
//        this.staff_fio = staff_fio;
//    }
//
//    public String getDob() {
//        return dob;
//    }
//
//    public void setDob(String dob) {
//        this.dob = dob;
//    }
//
//    public String getHiredDate() {
//        return hiredDate;
//    }
//
//    public void setHiredDate(String hiredDate) {
//        this.hiredDate = hiredDate;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//	public String getPicture() {
//		return picture;
//	}
//
//	public void setPicture(String picture) {
//		this.picture = picture;
//	}

    public int getId() {
        return id;
    }


    @Override
    public String toString() {

	return "Staff [id=" + id + ", staff_name=" + staff_name + ", staff_surname=" + staff_surname + ", staff_secondName= " + staff_secondName + ", staff_fio=" + staff_fio + ", dob=" + dob + ", hiredDate=" + hiredDate
				+ ", department=" + department + ", picture=" + picture + "]";


    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((dob == null) ? 0 : dob.hashCode());
        result = prime * result + ((hiredDate == null) ? 0 : hiredDate.hashCode());
        result = prime * result + id;
		result = prime * result + ((picture == null) ? 0 : picture.hashCode());
        result = prime * result + ((staff_name == null) ? 0 : staff_name.hashCode());
        result = prime * result + ((staff_surname == null) ? 0 : staff_surname.hashCode());
        result = prime * result + ((staff_secondName == null) ? 0 : staff_secondName.hashCode());
        result = prime * result + ((staff_fio == null) ? 0 : staff_fio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Staff other = (Staff) obj;
        if (department == null) {
            if (other.department != null)
                return false;
        } else if (!department.equals(other.department))
            return false;
        if (dob == null) {
            if (other.dob != null)
                return false;
        } else if (!dob.equals(other.dob))
            return false;
        if (hiredDate == null) {
            if (other.hiredDate != null)
                return false;
        } else if (!hiredDate.equals(other.hiredDate))
            return false;
        if (id != other.id)
            return false;
		if (picture == null) {
			if (other.picture != null)
				return false;
		} else if (!picture.equals(other.picture))
			return false;
        if (staff_name == null) {
            if (other.staff_name != null)
                return false;
        } else if (!staff_name.equals(other.staff_name))
            return false;
        if (staff_surname == null) {
            if (other.staff_surname != null)
                return false;
        } else if (!staff_surname.equals(other.staff_surname))
            return false;
        if (staff_secondName == null) {
            if (other.staff_secondName != null)
                return false;
        } else if (!staff_secondName.equals(other.staff_secondName))
            return false;
        if (staff_surname == null) {
            if (other.staff_fio != null)
                return false;
        } else if (!staff_fio.equals(other.staff_fio))
            return false;
        return true;
    }

}

