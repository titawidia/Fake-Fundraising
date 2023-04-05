package com.itc.fakefundraising.entities;

import com.itc.fakefundraising.enumiration.Akad;
import com.itc.fakefundraising.enumiration.Bank;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Objects;

@Entity
@Table (name = "donasi_transfer")
@Data
@ToString
public class DonasiTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String namaDonatur;

    @Column(nullable = false)
    private String noHp;

    @Column(nullable = false)
    private Integer jumlahDonasi;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Akad akad;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Bank bankTransfer;

    @Column(nullable = false)
    private String buktiTransfer;

    @Column(nullable = false)
    private String keterangan;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonasiTransfer that = (DonasiTransfer) o;
        return Objects.equals(id, that.id) && Objects.equals(namaDonatur, that.namaDonatur) && Objects.equals(noHp, that.noHp) && Objects.equals(jumlahDonasi, that.jumlahDonasi) && akad == that.akad && bankTransfer == that.bankTransfer && Objects.equals(buktiTransfer, that.buktiTransfer) && Objects.equals(keterangan, that.keterangan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namaDonatur, noHp, jumlahDonasi, akad, bankTransfer, buktiTransfer, keterangan);
    }
}
