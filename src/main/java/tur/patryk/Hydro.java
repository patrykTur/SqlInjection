package tur.patryk;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import java.time.LocalDateTime;
=======
import java.time.LocalDate;
import java.sql.Date;
>>>>>>> add original project files
=======
import java.time.LocalDateTime;
>>>>>>> feature_branch

>>>>>>> Add DateConverter and CheckNull class
public class Hydro {

    @JsonProperty("id_stacji")
    private Integer idStacji;

    private String stacja;
    private String rzeka;

    @JsonProperty("województwo")
    private String wojewodztwo;

    @JsonProperty("stan_wody")
<<<<<<< HEAD
    private String stanWody;
    @JsonProperty("stan_wody_data_pomiaru")
    private String stanWodyDataPomiaru;
    @JsonProperty("temperatura_wody")
    private String temperaturaWody;
    @JsonProperty("temperatura_wody_data_pomiaru")
    private String temperaturaWodyDataPomiaru;
    @JsonProperty("zjawisko_lodowe")
    private String zjawiskoLodowe;
    @JsonProperty("zjawisko_lodowe_data_pomiaru")
    private String zjawiskoLodoweDataPomiaru;
    @JsonProperty("zjawisko_zarastania")
    private String zjawiskoZarastania;
    @JsonProperty("zjawisko_zarastania_data_pomiaru")
    private String zjawiskoZarastaniaDataPomiaru;
=======
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
<<<<<<< HEAD
<<<<<<< HEAD
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime zjawiskoZarastaniaDataPomiaru;
>>>>>>> Add DateConverter and CheckNull class
=======
    private LocalDate zjawiskoZarastaniaDataPomiaru;
>>>>>>> add original project files
=======
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime zjawiskoZarastaniaDataPomiaru;
>>>>>>> feature_branch

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

    public String getStanWody() {
        return stanWody;
    }

    public void setStanWody(String stanWody) {
        this.stanWody = stanWody;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public String getStanWodyDataPomiaru() {
        return stanWodyDataPomiaru;
    }

    public void setStanWodyDataPomiaru(String stanWodyDataPomiaru) {
=======
    public LocalDateTime getStanWodyDataPomiaru() {
        return stanWodyDataPomiaru;
    }

    public void setStanWodyDataPomiaru(LocalDateTime stanWodyDataPomiaru) {
>>>>>>> Add DateConverter and CheckNull class
=======
    public LocalDate getStanWodyDataPomiaru() {
        return stanWodyDataPomiaru;
    }

    public void setStanWodyDataPomiaru(LocalDate stanWodyDataPomiaru) {
>>>>>>> add original project files
=======
    public LocalDateTime getStanWodyDataPomiaru() {
        return stanWodyDataPomiaru;
    }

    public void setStanWodyDataPomiaru(LocalDateTime stanWodyDataPomiaru) {
>>>>>>> feature_branch
        this.stanWodyDataPomiaru = stanWodyDataPomiaru;
    }

    public String getTemperaturaWody() {
        return temperaturaWody;
    }

    public void setTemperaturaWody(String temperaturaWody) {
        this.temperaturaWody = temperaturaWody;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public String getTemperaturaWodyDataPomiaru() {
        return temperaturaWodyDataPomiaru;
    }

    public void setTemperaturaWodyDataPomiaru(String temperaturaWodyDataPomiaru) {
=======
    public LocalDateTime getTemperaturaWodyDataPomiaru() {
        return temperaturaWodyDataPomiaru;
    }

    public void setTemperaturaWodyDataPomiaru(LocalDateTime temperaturaWodyDataPomiaru) {
>>>>>>> Add DateConverter and CheckNull class
=======
    public LocalDate getTemperaturaWodyDataPomiaru() {
        return temperaturaWodyDataPomiaru;
    }

    public void setTemperaturaWodyDataPomiaru(LocalDate temperaturaWodyDataPomiaru) {
>>>>>>> add original project files
=======
    public LocalDateTime getTemperaturaWodyDataPomiaru() {
        return temperaturaWodyDataPomiaru;
    }

    public void setTemperaturaWodyDataPomiaru(LocalDateTime temperaturaWodyDataPomiaru) {
>>>>>>> feature_branch
        this.temperaturaWodyDataPomiaru = temperaturaWodyDataPomiaru;
    }

    public String getZjawiskoLodowe() {
        return zjawiskoLodowe;
    }

    public void setZjawiskoLodowe(String zjawiskoLodowe) {
        this.zjawiskoLodowe = zjawiskoLodowe;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public String getZjawiskoLodoweDataPomiaru() {
        return zjawiskoLodoweDataPomiaru;
    }

    public void setZjawiskoLodoweDataPomiaru(String zjawiskoLodoweDataPomiaru) {
=======
    public LocalDateTime getZjawiskoLodoweDataPomiaru() {
        return zjawiskoLodoweDataPomiaru;
    }

    public void setZjawiskoLodoweDataPomiaru(LocalDateTime zjawiskoLodoweDataPomiaru) {
>>>>>>> Add DateConverter and CheckNull class
=======
    public LocalDate getZjawiskoLodoweDataPomiaru() {
        return zjawiskoLodoweDataPomiaru;
    }

    public void setZjawiskoLodoweDataPomiaru(LocalDate zjawiskoLodoweDataPomiaru) {
>>>>>>> add original project files
=======
    public LocalDateTime getZjawiskoLodoweDataPomiaru() {
        return zjawiskoLodoweDataPomiaru;
    }

    public void setZjawiskoLodoweDataPomiaru(LocalDateTime zjawiskoLodoweDataPomiaru) {
>>>>>>> feature_branch
        this.zjawiskoLodoweDataPomiaru = zjawiskoLodoweDataPomiaru;
    }

    public String getZjawiskoZarastania() {
        return zjawiskoZarastania;
    }

    public void setZjawiskoZarastania(String zjawiskoZarastania) {
        this.zjawiskoZarastania = zjawiskoZarastania;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public String getZjawiskoZarastaniaDataPomiaru() {
        return zjawiskoZarastaniaDataPomiaru;
    }

    public void setZjawiskoZarastaniaDataPomiaru(String zjawiskoZarastaniaDataPomiaru) {
=======
    public LocalDateTime getZjawiskoZarastaniaDataPomiaru() {
        return zjawiskoZarastaniaDataPomiaru;
    }

    public void setZjawiskoZarastaniaDataPomiaru(LocalDateTime zjawiskoZarastaniaDataPomiaru) {
>>>>>>> Add DateConverter and CheckNull class
=======
    public LocalDate getZjawiskoZarastaniaDataPomiaru() {
        return zjawiskoZarastaniaDataPomiaru;
    }

    public void setZjawiskoZarastaniaDataPomiaru(LocalDate zjawiskoZarastaniaDataPomiaru) {
>>>>>>> add original project files
=======
    public LocalDateTime getZjawiskoZarastaniaDataPomiaru() {
        return zjawiskoZarastaniaDataPomiaru;
    }

    public void setZjawiskoZarastaniaDataPomiaru(LocalDateTime zjawiskoZarastaniaDataPomiaru) {
>>>>>>> feature_branch
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
