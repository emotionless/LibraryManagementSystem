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
@Table(name = "bookmanagement", catalog = "iit", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bookmanagement.findAll", query = "SELECT b FROM Bookmanagement b"),
    @NamedQuery(name = "Bookmanagement.findByBooktitle", query = "SELECT b FROM Bookmanagement b WHERE b.booktitle = :booktitle"),
    @NamedQuery(name = "Bookmanagement.findByAuthorsfirstname", query = "SELECT b FROM Bookmanagement b WHERE b.authorsfirstname = :authorsfirstname"),
    @NamedQuery(name = "Bookmanagement.findByAuthorslastname", query = "SELECT b FROM Bookmanagement b WHERE b.authorslastname = :authorslastname"),
    @NamedQuery(name = "Bookmanagement.findByBookedition", query = "SELECT b FROM Bookmanagement b WHERE b.bookedition = :bookedition"),
    @NamedQuery(name = "Bookmanagement.findByPublisher", query = "SELECT b FROM Bookmanagement b WHERE b.publisher = :publisher"),
    @NamedQuery(name = "Bookmanagement.findByPublishedyear", query = "SELECT b FROM Bookmanagement b WHERE b.publishedyear = :publishedyear"),
    @NamedQuery(name = "Bookmanagement.findByCatagory", query = "SELECT b FROM Bookmanagement b WHERE b.catagory = :catagory"),
    @NamedQuery(name = "Bookmanagement.findBySelfno", query = "SELECT b FROM Bookmanagement b WHERE b.selfno = :selfno"),
    @NamedQuery(name = "Bookmanagement.findByEntrydate", query = "SELECT b FROM Bookmanagement b WHERE b.entrydate = :entrydate"),
    @NamedQuery(name = "Bookmanagement.findByPrice", query = "SELECT b FROM Bookmanagement b WHERE b.price = :price"),
    @NamedQuery(name = "Bookmanagement.findByIdentificationnumber", query = "SELECT b FROM Bookmanagement b WHERE b.identificationnumber = :identificationnumber"),
    @NamedQuery(name = "Bookmanagement.findBySerialno", query = "SELECT b FROM Bookmanagement b WHERE b.serialno = :serialno")})
public class Bookmanagement implements Serializable {
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
    @Column(name = "publisher")
    private String publisher;
    @Basic(optional = false)
    @Column(name = "publishedyear")
    private String publishedyear;
    @Basic(optional = false)
    @Column(name = "Catagory")
    private String catagory;
    @Basic(optional = false)
    @Column(name = "selfno")
    private String selfno;
    @Basic(optional = false)
    @Column(name = "entrydate")
    private String entrydate;
    @Basic(optional = false)
    @Column(name = "price")
    private String price;
    @Basic(optional = false)
    @Column(name = "identificationnumber")
    private String identificationnumber;
    @Id
    @Basic(optional = false)
    @Column(name = "serialno")
    private Long serialno;

    public Bookmanagement() {
    }

    public Bookmanagement(Long serialno) {
        this.serialno = serialno;
    }

    public Bookmanagement(Long serialno, String booktitle, String authorsfirstname, String authorslastname, String bookedition, String publisher, String publishedyear, String catagory, String selfno, String entrydate, String price, String identificationnumber) {
        this.serialno = serialno;
        this.booktitle = booktitle;
        this.authorsfirstname = authorsfirstname;
        this.authorslastname = authorslastname;
        this.bookedition = bookedition;
        this.publisher = publisher;
        this.publishedyear = publishedyear;
        this.catagory = catagory;
        this.selfno = selfno;
        this.entrydate = entrydate;
        this.price = price;
        this.identificationnumber = identificationnumber;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        String oldPublisher = this.publisher;
        this.publisher = publisher;
        changeSupport.firePropertyChange("publisher", oldPublisher, publisher);
    }

    public String getPublishedyear() {
        return publishedyear;
    }

    public void setPublishedyear(String publishedyear) {
        String oldPublishedyear = this.publishedyear;
        this.publishedyear = publishedyear;
        changeSupport.firePropertyChange("publishedyear", oldPublishedyear, publishedyear);
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        String oldCatagory = this.catagory;
        this.catagory = catagory;
        changeSupport.firePropertyChange("catagory", oldCatagory, catagory);
    }

    public String getSelfno() {
        return selfno;
    }

    public void setSelfno(String selfno) {
        String oldSelfno = this.selfno;
        this.selfno = selfno;
        changeSupport.firePropertyChange("selfno", oldSelfno, selfno);
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        String oldEntrydate = this.entrydate;
        this.entrydate = entrydate;
        changeSupport.firePropertyChange("entrydate", oldEntrydate, entrydate);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getIdentificationnumber() {
        return identificationnumber;
    }

    public void setIdentificationnumber(String identificationnumber) {
        String oldIdentificationnumber = this.identificationnumber;
        this.identificationnumber = identificationnumber;
        changeSupport.firePropertyChange("identificationnumber", oldIdentificationnumber, identificationnumber);
    }

    public Long getSerialno() {
        return serialno;
    }

    public void setSerialno(Long serialno) {
        Long oldSerialno = this.serialno;
        this.serialno = serialno;
        changeSupport.firePropertyChange("serialno", oldSerialno, serialno);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serialno != null ? serialno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookmanagement)) {
            return false;
        }
        Bookmanagement other = (Bookmanagement) object;
        if ((this.serialno == null && other.serialno != null) || (this.serialno != null && !this.serialno.equals(other.serialno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "librarymanagement.Bookmanagement[ serialno=" + serialno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
