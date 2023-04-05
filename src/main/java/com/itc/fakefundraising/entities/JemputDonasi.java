package com.itc.fakefundraising.entities;

import com.itc.fakefundraising.enumeration.AkadPundi;
import com.itc.fakefundraising.enumeration.Pundi;
import com.itc.fakefundraising.enumeration.Unit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "jemput_donasi")
@Data
@ToString
public class JemputDonasi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date tanggal;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Unit unit;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Pundi keteranganPundi;

    @Column(nullable = false)
    private String kodeOutlet;

    @Column(nullable = false)
    private String nominal;

    @Column(nullable = false)
    private AkadPundi akadJemputDonasi;

    @Column(nullable = false)
    private String noKuitansi;

    @Column(nullable = false)
    private String fotoKuitansi;

    @Column(nullable = false)
    private String keterangan;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JemputDonasi that = (JemputDonasi) o;
        return Objects.equals(id, that.id) && Objects.equals(tanggal, that.tanggal) && unit == that.unit && keteranganPundi == that.keteranganPundi && Objects.equals(kodeOutlet, that.kodeOutlet) && Objects.equals(nominal, that.nominal) && akadJemputDonasi == that.akadJemputDonasi && Objects.equals(noKuitansi, that.noKuitansi) && Objects.equals(fotoKuitansi, that.fotoKuitansi) && Objects.equals(keterangan, that.keterangan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tanggal, unit, keteranganPundi, kodeOutlet, nominal, akadJemputDonasi, noKuitansi, fotoKuitansi, keterangan);
    }
}
