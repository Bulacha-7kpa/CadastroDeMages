package com.ph.mastering_springboot.Odisseias;

import com.ph.mastering_springboot.Mages.MageModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_odisseias")
public class OdisseiasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String objetivo;
    private String dificuldade;

    @OneToMany(mappedBy = "odisseias")
    private List<MageModel> mages;
}
