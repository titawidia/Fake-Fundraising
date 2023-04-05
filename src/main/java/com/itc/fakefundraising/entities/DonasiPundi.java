package com.itc.fakefundraising.entities;

import com.itc.fakefundraising.enumiration.Unit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;

@Entity
@Table (name = "donasi_pundi")
@Data
@ToString
public class DonasiPundi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Unit unit;

    @Column(nullable = false)
    private String namaOutlet;

    @Column(nullable = false)
    private String alamat;

    @Column(nullable = false)
    private String namaPemilik;

    @Column(nullable = false)
    private Date tanggal;

    @Column(nullable = false)
    private String fotoKuitansi;

    @Column(nullable = false)
    private String titikKoordinat;

    @Column(nullable = false)
    private String keterangan;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonasiPundi that = (DonasiPundi) o;
        return Objects.equals(id, that.id) && unit == that.unit && Objects.equals(namaOutlet, that.namaOutlet) && Objects.equals(alamat, that.alamat) && Objects.equals(namaPemilik, that.namaPemilik) && Objects.equals(tanggal, that.tanggal) && Objects.equals(fotoKuitansi, that.fotoKuitansi) && Objects.equals(titikKoordinat, that.titikKoordinat) && Objects.equals(keterangan, that.keterangan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, unit, namaOutlet, alamat, namaPemilik, tanggal, fotoKuitansi, titikKoordinat, keterangan);
    }
}
