/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jonas
 */
@Entity
public class Palindrome implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "employee_name")
    private String name;
    
    @Column(name = "Unique_id")
    private String uniqueId;
    
    @Column(name = "palindrome_number")
    private Integer digit;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDtate;

    public Palindrome() {
    }

    public Palindrome(String name, String uniqueId, Integer digit) {
        this.name = name;
        this.uniqueId = uniqueId;
        this.digit = digit;
        this.creationDtate = new Date();
    }

    public Palindrome(Long id, String name, String uniqueId, Integer digit) {
        this.id = id;
        this.name = name;
        this.uniqueId = uniqueId;
        this.digit = digit;
        this.creationDtate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Integer getDigit() {
        return digit;
    }

    public void setDigit(Integer digit) {
        this.digit = digit;
    }

    public boolean isPalindrome() {
        if (digit == null || digit < 0) {
            return false;
        }
        int remaining = digit;
        long reversed = 0;
        do {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        } while (remaining != 0);
        return digit == reversed;
    }

    public Date getCreationDtate() {
        return creationDtate;
    }

    public void setCreationDtate(Date creationDtate) {
        this.creationDtate = creationDtate;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Palindrome)) {
            return false;
        }
        Palindrome other = (Palindrome) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entity.Palindrome[ id=" + id + " ]";
    }
    
}
