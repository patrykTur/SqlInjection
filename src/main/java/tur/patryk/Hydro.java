package tur.patryk;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class Hydro {

    @JsonProperty("id_stacji")
    private Integer idStacji;

    private String stacja;
    private String rzeka;

    @JsonProperty("województwo")
    private String wojewodztwo;

    @JsonProperty("stan_wody")
    private Integer stanWody;

    @JsonProperty("stan_wody_data_pomiaru")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime stanWodyDataPomiaru;

    @JsonProperty("temperatura_wody")
    private Double temperaturaWody;

    @JsonProperty("temperatura_wody_data_pomiaru")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime temperaturaWodyDataPomiaru;

    @JsonProperty("zjawisko_lodowe")
    private Integer zjawiskoLodowe;

    @JsonProperty("zjawisko_lodowe_data_pomiaru")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime zjawiskoLodoweDataPomiaru;

    @JsonProperty("zjawisko_zarastania")
    private Integer zjawiskoZarastania;

    @JsonProperty("zjawisko_zarastania_data_pomiaru")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime zjawiskoZarastaniaDataPomiaru;

    public Integer getIdStacji() {
        return idStacji;
    }

    public void setIdStacji(Integer idStacji) {
        this.idStacji = idStacji;
    }

    public String getStacja() {
        return stacja;
    }

    public void setStacja(String stacja) {
        this.stacja = stacja;
    }

    public String getRzeka() {
        return rzeka;
    }

    public void setRzeka(String rzeka) {
        this.rzeka = rzeka;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    public Integer getStanWody() {
        return stanWody;
    }

    public void setStanWody(Integer stanWody) {
        this.stanWody = stanWody;
    }

    public LocalDateTime getStanWodyDataPomiaru() {
        return stanWodyDataPomiaru;
    }

    public void setStanWodyDataPomiaru(LocalDateTime stanWodyDataPomiaru) {
        this.stanWodyDataPomiaru = stanWodyDataPomiaru;
    }

    public Double getTemperaturaWody() {
        return temperaturaWody;
    }

    public void setTemperaturaWody(Double temperaturaWody) {
        this.temperaturaWody = temperaturaWody;
    }

    public LocalDateTime getTemperaturaWodyDataPomiaru() {
        return temperaturaWodyDataPomiaru;
    }

    public void setTemperaturaWodyDataPomiaru(LocalDateTime temperaturaWodyDataPomiaru) {
        this.temperaturaWodyDataPomiaru = temperaturaWodyDataPomiaru;
    }

    public Integer getZjawiskoLodowe() {
        return zjawiskoLodowe;
    }

    public void setZjawiskoLodowe(Integer zjawiskoLodowe) {
        this.zjawiskoLodowe = zjawiskoLodowe;
    }

    public LocalDateTime getZjawiskoLodoweDataPomiaru() {
        return zjawiskoLodoweDataPomiaru;
    }

    public void setZjawiskoLodoweDataPomiaru(LocalDateTime zjawiskoLodoweDataPomiaru) {
        this.zjawiskoLodoweDataPomiaru = zjawiskoLodoweDataPomiaru;
    }

    public Integer getZjawiskoZarastania() {
        return zjawiskoZarastania;
    }

    public void setZjawiskoZarastania(Integer zjawiskoZarastania) {
        this.zjawiskoZarastania = zjawiskoZarastania;
    }

    public LocalDateTime getZjawiskoZarastaniaDataPomiaru() {
        return zjawiskoZarastaniaDataPomiaru;
    }

    public void setZjawiskoZarastaniaDataPomiaru(LocalDateTime zjawiskoZarastaniaDataPomiaru) {
        this.zjawiskoZarastaniaDataPomiaru = zjawiskoZarastaniaDataPomiaru;
    }

    @Override
    public String toString() {
        return "Hydro{" +
                "idStacji=" + idStacji +
                ", stacja='" + stacja + '\'' +
                ", rzeka='" + rzeka + '\'' +
                ", wojewodztwo='" + wojewodztwo + '\'' +
                ", stanWody=" + stanWody +
                ", stanWodyDataPomiaru=" + stanWodyDataPomiaru +
                ", temperaturaWody=" + temperaturaWody +
                ", temperaturaWodyDataPomiaru=" + temperaturaWodyDataPomiaru +
                ", zjawiskoLodowe=" + zjawiskoLodowe +
                ", zjawiskoLodoweDataPomiaru=" + zjawiskoLodoweDataPomiaru +
                ", zjawiskoZarastania=" + zjawiskoZarastania +
                ", zjawiskoZarastaniaDataPomiaru=" + zjawiskoZarastaniaDataPomiaru +
                '}';
    }
}
