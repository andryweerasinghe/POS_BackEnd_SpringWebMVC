/*
 * Author  : Mr.electrix
 * Project : CSS_Assignment_06_BackEnd_SpringMVC
 * Date    : 10/10/24

 */

package lk.ijse.aad.css_assignment_06_backend_springmvc.entity.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.aad.css_assignment_06_backend_springmvc.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer implements SuperEntity {
    @Id
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
}
