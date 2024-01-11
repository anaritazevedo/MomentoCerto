package com.darksun.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Preco implements Serializable {
    @Serial
    private static final long serialVersionUID = 4883335620940249032L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private BigDecimal preco;
   private LocalDateTime data;

   @ManyToOne
   @JsonIgnoreProperties("preco")
   @MapsId("produtoId")
   private Produto produto;


}
