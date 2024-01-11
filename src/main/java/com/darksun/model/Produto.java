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
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto implements Serializable {

    @Serial
    private static final long serialVersionUID = 6904750453783399170L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String url;
    private BigDecimal precoIdeal;


    @OneToMany(mappedBy = "produto", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("produto")
    private List<Preco> preco;
}
