/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author SHAMS
 */
@Entity
@Table(name = "bookdistribution", catalog = "iit", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bookdistribution.findAll", query = "SELECT b FROM Bookdistribution b"),
    @NamedQuery(name = "Bookdistribution.findByBooktitle", query = "SELECT b FROM Bookdistribution b WHERE b.booktitle = :booktitle"),
    @NamedQuery(name = "Bookdistribution.findByAuthorsfirstname", query = "SELECT b FROM Bookdistribution b WHERE b.authorsfirstname = :authorsfirstname"),
    @NamedQuery(name = "Bookdistribution.findByAuthorslastname", query = "SELECT b FROM Bookdistribution b WHERE b.authorslastname = :authorslastname"),
    @NamedQuery(name = "Bookdistribution.findByBookedition", query = "SELECT b FROM Bookdistribution b WHERE b.bookedition = :bookedition"),
    @NamedQuery(name = "Bookdistribution.findByIdentificationnumber", query = "SELECT b FROM Bookdistribution b WHERE b.identificationnumber = :identificationnumber"),
    @NamedQuery(name = "Bookdistribution.findBySerialno", query = "SELECT b FROM Bookdistribution b WHERE b.serialno = :serialno"),
    @NamedQuery(name = "Bookdistribution.findByStudentname", query = "SELECT b FROM Bookdistribution b WHERE b.studentname = :studentname"),
    @NamedQuery(name = "Bookdistribution.findByStudentidnumber", query = "SELECT b FROM Bookdistribution b WHERE b.studentidnumber = :studentidnumber"),
    @NamedQuery(name = "Bookdistribution.findByDateofissue", query = "SELECT b FROM Bookdistribution b WHERE b.dateofissue = :dateofissue"),
    @NamedQuery(name = "Bookdistribution.findByDatetoreturn", query = "SELECT b FROM Bookdistribution b WHERE b.datetoreturn = :datetoreturn"),
    @NamedQuery(name = "Bookdistribution.findByCatagory", query = "SELECT b FROM Bookdistribution b WHERE b.catagory = :catagory")})
public class Bookdistribution implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "booktitle")
    private String booktitle;
    @Basic(optional = false)
    @Column(name = "authorsfirstname")
    private String authorsfirstname;
    @Basic(optional = false)
    @Column(name = "authorslastname")
    private String authorslastname;
    @Basic(optional = false)
    @Column(name = "bookedition")
    private String bookedition;
    @Basic(optional = false)
    @Column(name = "identificationnumber")
    private String identificationnumber;
    @Basic(optional = false)
    @Column(name = "serialno")
    private long serialno;
    @Basic(optional = false)
    @Column(name = "studentname")
    private String studentname;
    @Id
    @Basic(optional = false)
    @Column(name = "studentidnumber")
    private Long studentidnumber;
    @Basic(optional = false)
    @Column(name = "dateofissue")
    private String dateofissue;
    @Basic(optional = false)
    @Column(name = "datetoreturn")
    private String datetoreturn;
    @Basic(optional = false)
    @Column(name = "Catagory")
    private String catagory;

    public Bookdistribution() {
    }

    public Bookdistribution(Long studentidnumber) {
        this.studentidnumber = studentidnumber;
    }

    public Bookdistribution(Long studentidnumber, String booktitle, String authorsfirstname, String authorslastname, String bookedition, String identificationnumber, long serialno, String studentname, String dateofissue, String datetoreturn, String catagory) {
        this.studentidnumber = studentidnumber;
        this.booktitle = booktitle;
        this.authorsfirstname = authorsfirstname;
        this.authorslastname = authorslastname;
        this.bookedition = bookedition;
        this.identificationnumber = identificationnumber;
        this.serialno = serialno;
        this.studentname = studentname;
        this.dateofissue = dateofissue;
        this.datetoreturn = datetoreturn;
        this.catagory = catagory;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        String oldBooktitle = this.booktitle;
        this.booktitle = booktitle;
        changeSupport.firePropertyChange("booktitle", oldBooktitle, booktitle);
    }

    public String getAuthorsfirstname() {
        return authorsfirstname;
    }

    public void setAuthorsfirstname(String authorsfirstname) {
        String oldAuthorsfirstname = this.authorsfirstname;
        this.authorsfirstname = authorsfirstname;
        changeSupport.firePropertyChange("authorsfirstname", oldAuthorsfirstname, authorsfirstname);
    }

    public String getAuthorslastname() {
        return authorslastname;
    }

    public void setAuthorslastname(String authorslastname) {
        String oldAuthorslastname = this.authorslastname;
        this.authorslastname = authorslastname;
        changeSupport.firePropertyChange("authorslastname", oldAuthorslastname, authorslastname);
    }

    public String getBookedition() {
        return bookedition;
    }

    public void setBookedition(String bookedition) {
        String oldBookedition = this.bookedition;
        this.bookedition = bookedition;
        changeSupport.firePropertyChange("bookedition", oldBookedition, bookedition);
    }

    public String getIdentificationnumber() {
        return identificationnumber;
    }

    public void setIdentificationnumber(String identificationnumber) {
        String oldIdentificationnumber = this.identificationnumber;
        this.identificationnumber = identificationnumber;
        changeSupport.firePropertyChange("identificationnumber", oldIdentificationnumber, identificationnumber);
    }

    public long getSerialno() {
        return serialno;
    }

    public void setSerialno(long serialno) {
        long oldSerialno = this.serialno;
        this.serialno = serialno;
        changeSupport.firePropertyChange("serialno", oldSerialno, serialno);
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        String oldStudentname = this.studentname;
        this.studentname = studentname;
        changeSupport.firePropertyChange("studentname", oldStudentname, studentname);
    }

    public Long getStudentidnumber() {
        return studentidnumber;
    }

    public void setStudentidnumber(Long studentidnumber) {
        Long oldStudentidnumber = this.studentidnumber;
        this.studentidnumber = studentidnumber;
        changeSupport.firePropertyChange("studentidnumber", oldStudentidnumber, studentidnumber);
    }

    public String getDateofissue() {
        return dateofissue;
    }

    public void setDateofissue(String dateofissue) {
        String oldDateofissue = this.dateofissue;
        this.dateofissue = dateofissue;
        changeSupport.firePropertyChange("dateofissue", oldDateofissue, dateofissue);
    }

    public String getDatetoreturn() {
        return datetoreturn;
    }

    public void setDatetoreturn(String datetoreturn) {
        String oldDatetoreturn = this.datetoreturn;
        this.datetoreturn = datetoreturn;
        changeSupport.firePropertyChange("datetoreturn", oldDatetoreturn, datetoreturn);
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        String oldCatagory = this.catagory;
        this.catagory = catagory;
        changeSupport.firePropertyChange("catagory", oldCatagory, catagory);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentidnumber != null ? studentidnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookdistribution)) {
            return false;
        }
        Bookdistribution other = (Bookdistribution) object;
        if ((this.studentidnumber == null && other.studentidnumber != null) || (this.studentidnumber != null && !this.studentidnumber.equals(other.studentidnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librarymanagement.Bookdistribution[ studentidnumber=" + studentidnumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
