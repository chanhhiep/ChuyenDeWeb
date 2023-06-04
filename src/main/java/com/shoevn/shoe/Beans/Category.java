
package com.shoevn.shoe.Beans;

import com.shoevn.shoe.Beans.base.AuditableBase;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
@SQLDelete(sql = "UPDATE category SET isDeleted = true WHERE id_category = ?")
@Where(clause = "is_deleted = false")
@EqualsAndHashCode(callSuper = true)
public class Category extends AuditableBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category", nullable = false)
    private Long id_category;
    @Column(name = "name", length = 255, nullable = false)
    private String name;
    @Column(name = "img", length = 255)
    private String img;

    @Column(name = "parent_id",length = 20, nullable = false)
    private int parent_id;

    public void setImg(String img) {
        this.img = img;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

}
