package com.itc.fakefundraising.entities;

import com.itc.fakefundraising.enumiration.Unit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;

@Entity
@Table (name = "data_donatur")
@Data
@ToString
public class DataDonatur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date tanggal;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Unit unit;

    @Column(nullable = false)
    private String nama;

    @Column(nullable = false)
    private String alamat;

    @Column(nullable = false)
    private String noHp;

    @Column(nullable = false)
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataDonatur that = (DataDonatur) o;
        return Objects.equals(id, that.id) && Objects.equals(tanggal, that.tanggal) && unit == that.unit && Objects.equals(nama, that.nama) && Objects.equals(alamat, that.alamat) && Objects.equals(noHp, that.noHp) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tanggal, unit, nama, alamat, noHp, email);
    }
}
