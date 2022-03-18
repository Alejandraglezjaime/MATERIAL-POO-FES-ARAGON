/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.dt;

import libro.datos.Autor;
import libro.datos.Editorial;

/**
 *
 * @author alejandraglezj
 */
public class partes {
  private String titulo;
  private String tituloOriginal;
  private String subtitulo;
  private String diseñoPortada;
  private String traduccion;
  private String diseñoInteriorIlustraciones;
  private String lugarImpresion;
  private int volumen;
  private int numPaginas;
  private int capitulos;
  private Autor creador;
  private Editorial edit; 

    public partes() {
    }

  //*****************************************
    public partes(String titulo, String tituloOriginal, String subtitulo, String diseñoPortada, String traduccion, String diseñoInteriorIlustraciones, String lugarImpresion, int volumen, int numPaginas, int capitulos, Autor creador, Editorial edit) {
        this.titulo = titulo;
        this.tituloOriginal = tituloOriginal;
        this.subtitulo = subtitulo;
        this.diseñoPortada = diseñoPortada;
        this.traduccion = traduccion;
        this.diseñoInteriorIlustraciones = diseñoInteriorIlustraciones;
        this.lugarImpresion = lugarImpresion;
        this.volumen = volumen;
        this.numPaginas = numPaginas;
        this.capitulos = capitulos;
        this.creador = creador;
        this.edit = edit;
    }
    //*********************************************************************

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getDiseñoPortada() {
        return diseñoPortada;
    }

    public void setDiseñoPortada(String diseñoPortada) {
        this.diseñoPortada = diseñoPortada;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    public String getDiseñoInteriorIlustraciones() {
        return diseñoInteriorIlustraciones;
    }

    public void setDiseñoInteriorIlustraciones(String diseñoInteriorIlustraciones) {
        this.diseñoInteriorIlustraciones = diseñoInteriorIlustraciones;
    }

    public String getLugarImpresion() {
        return lugarImpresion;
    }

    public void setLugarImpresion(String lugarImpresion) {
        this.lugarImpresion = lugarImpresion;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public Autor getCreador() {
        return creador;
    }

    public void setCreador(Autor creador) {
        this.creador = creador;
    }

    public Editorial getEdit() {
        return edit;
    }

    public void setEdit(Editorial edit) {
        this.edit = edit;
    }
    //********************************************

    @Override
    public String toString() {
        return "partes{" + "titulo=" + titulo + ", tituloOriginal=" + tituloOriginal + ", subtitulo=" + subtitulo + ", dise\u00f1oPortada=" + diseñoPortada + ", traduccion=" + traduccion + ", dise\u00f1oInteriorIlustraciones=" + diseñoInteriorIlustraciones + ", lugarImpresion=" + lugarImpresion + ", volumen=" + volumen + ", numPaginas=" + numPaginas + ", capitulos=" + capitulos + ", creador=" + creador + ", edit=" + edit + '}';
    }
    //***********************************************
    public void accion(){
        System.out.println("leyendo...continuar leyendo....");
    }
    

   
    
}
