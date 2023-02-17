package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor // 모든 필드값을 파라미터로 받는 생성자를 만듬
@NoArgsConstructor // 파라미터가 없는 기본생성자 생성
public class todoEntity {


}
