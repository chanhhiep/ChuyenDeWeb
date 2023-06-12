
package com.shoevn.shoe.Beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.shoevn.shoe.Beans.base.AuditableBase;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "size")
@EqualsAndHashCode(callSuper = true)
public class Size extends AuditableBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id", nullable = false)
    private Long id;
    @Column(name = "size_num",nullable = false)
    private int size_num;
    @Column(name = "size_description",nullable = false)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSize_num() {
        return size_num;
    }

    public void setSize_num(int size_num) {
        this.size_num = size_num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}