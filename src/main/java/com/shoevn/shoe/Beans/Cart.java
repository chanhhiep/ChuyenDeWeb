package com.shoevn.shoe.Beans;

import com.shoevn.shoe.Beans.base.AuditableBase;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cart")
@EqualsAndHashCode(callSuper = true)
public class Cart  extends AuditableBase {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Product product;
  @OneToOne
    private User user;
    private int quantity;
    private String size;


}

