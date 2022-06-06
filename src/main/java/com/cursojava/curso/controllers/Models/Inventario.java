package com.cursojava.curso.controllers.Models;
import javax.persistence.*;

@Entity
@Table(name = "nuevas_tablas")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
     @Column(name = "marca")
    private String marca;
    @Column(name = "procesador")
    private String procesador;
    @Column(name = "memoriaRam")
    private String memoriaRam;
     @Column(name = "pantalla")
    private String pantalla;
     @Column(name = "tarjetaGrafica")
    private String tarjetaGarfica;
     @Column(name="numeroDeSerie")
     private String numeroDeSerie;

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getTarjetaGarfica() {
        return tarjetaGarfica;
    }

    public void setTarjetaGarfica(String tarjetaGarfica) {
        this.tarjetaGarfica = tarjetaGarfica;
    }
//mejor la fecha de nacimiento que la edad
    //age:Edad
    /*Calendar fechaNac = new GregorianCalendar(getyearNac(),getMesNac(),getDiaNaci());
    Calendar fechaHoy = Calendar.getInstance();
    int yearNacimiento = fechaNac.get(Calendar.YEAR);
    int yearHoy = fechaHoy.get(Calendar.YEAR);
    private int yearOld = (yearNacimiento)-(yearHoy);

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }*/
}
