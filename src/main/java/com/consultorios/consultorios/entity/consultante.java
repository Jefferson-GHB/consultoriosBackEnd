package com.consultorios.consultorios.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class consultante
{
    @Id
    private int I_DOC_IDENTIFICACION;

    private String C_NOMBRES;
    private String C_APELLIDOS;
    private String C_GENERO;
    private int I_TIPO_DOC;
    private int I_ID_CONSULTANTE;
    private int I_LUGAR_EXPEDICION;
    private int I_EDAD;
    private String C_ESTADO_CIVIL;
    private String C_TIPO_VIVIENDA;
    private String C_DIRECCION;
    private String C_TELEFONO_PERSONAL;
    private String C_EMPRESA;
    private String C_TELEFONO_EMPRESA;
    private double I_INGRESOS_MENSUALES;
    private int I_PERSONAS_A_CARGO;
    private String C_DESPLAZADO;
    private String C_OCUPACION;
    private String C_TRABAJA;
    private String C_PER_RED_UNIDOS;

    private int C_ESTRATO;
    private int C_SISBEN;

    private int NIVEL_ESTUDIOS;

    public consultante() {
    }

    public consultante(int i_DOC_IDENTIFICACION, String c_NOMBRES, String c_APELLIDOS, String c_GENERO, int i_TIPO_DOC, int i_ID_CONSULTANTE, int i_LUGAR_EXPEDICION, int i_EDAD, String c_ESTADO_CIVIL, String c_TIPO_VIVIENDA, String c_DIRECCION, String c_TELEFONO_PERSONAL, String c_EMPRESA, String c_TELEFONO_EMPRESA, double i_INGRESOS_MENSUALES, int i_PERSONAS_A_CARGO, String c_DESPLAZADO, String c_OCUPACION, String c_TRABAJA, String c_PER_RED_UNIDOS, int c_ESTRATO, int c_SISBEN, int NIVEL_ESTUDIOS) {
        I_DOC_IDENTIFICACION = i_DOC_IDENTIFICACION;
        C_NOMBRES = c_NOMBRES;
        C_APELLIDOS = c_APELLIDOS;
        C_GENERO = c_GENERO;
        I_TIPO_DOC = i_TIPO_DOC;
        I_ID_CONSULTANTE = i_ID_CONSULTANTE;
        I_LUGAR_EXPEDICION = i_LUGAR_EXPEDICION;
        I_EDAD = i_EDAD;
        C_ESTADO_CIVIL = c_ESTADO_CIVIL;
        C_TIPO_VIVIENDA = c_TIPO_VIVIENDA;
        C_DIRECCION = c_DIRECCION;
        C_TELEFONO_PERSONAL = c_TELEFONO_PERSONAL;
        C_EMPRESA = c_EMPRESA;
        C_TELEFONO_EMPRESA = c_TELEFONO_EMPRESA;
        I_INGRESOS_MENSUALES = i_INGRESOS_MENSUALES;
        I_PERSONAS_A_CARGO = i_PERSONAS_A_CARGO;
        C_DESPLAZADO = c_DESPLAZADO;
        C_OCUPACION = c_OCUPACION;
        C_TRABAJA = c_TRABAJA;
        C_PER_RED_UNIDOS = c_PER_RED_UNIDOS;
        C_ESTRATO = c_ESTRATO;
        C_SISBEN = c_SISBEN;
        this.NIVEL_ESTUDIOS = NIVEL_ESTUDIOS;
    }

    public int getI_DOC_IDENTIFICACION() {
        return I_DOC_IDENTIFICACION;
    }

    public void setI_DOC_IDENTIFICACION(int i_DOC_IDENTIFICACION) {
        I_DOC_IDENTIFICACION = i_DOC_IDENTIFICACION;
    }

    public String getC_NOMBRES() {
        return C_NOMBRES;
    }

    public void setC_NOMBRES(String c_NOMBRES) {
        C_NOMBRES = c_NOMBRES;
    }

    public String getC_APELLIDOS() {
        return C_APELLIDOS;
    }

    public void setC_APELLIDOS(String c_APELLIDOS) {
        C_APELLIDOS = c_APELLIDOS;
    }

    public String getC_GENERO() {
        return C_GENERO;
    }

    public void setC_GENERO(String c_GENERO) {
        C_GENERO = c_GENERO;
    }

    public int getI_TIPO_DOC() {
        return I_TIPO_DOC;
    }

    public void setI_TIPO_DOC(int i_TIPO_DOC) {
        I_TIPO_DOC = i_TIPO_DOC;
    }

    public int getI_ID_CONSULTANTE() {
        return I_ID_CONSULTANTE;
    }

    public void setI_ID_CONSULTANTE(int i_ID_CONSULTANTE) {
        I_ID_CONSULTANTE = i_ID_CONSULTANTE;
    }

    public int getI_LUGAR_EXPEDICION() {
        return I_LUGAR_EXPEDICION;
    }

    public void setI_LUGAR_EXPEDICION(int i_LUGAR_EXPEDICION) {
        I_LUGAR_EXPEDICION = i_LUGAR_EXPEDICION;
    }

    public int getI_EDAD() {
        return I_EDAD;
    }

    public void setI_EDAD(int i_EDAD) {
        I_EDAD = i_EDAD;
    }

    public String getC_ESTADO_CIVIL() {
        return C_ESTADO_CIVIL;
    }

    public void setC_ESTADO_CIVIL(String c_ESTADO_CIVIL) {
        C_ESTADO_CIVIL = c_ESTADO_CIVIL;
    }

    public String getC_TIPO_VIVIENDA() {
        return C_TIPO_VIVIENDA;
    }

    public void setC_TIPO_VIVIENDA(String c_TIPO_VIVIENDA) {
        C_TIPO_VIVIENDA = c_TIPO_VIVIENDA;
    }

    public String getC_DIRECCION() {
        return C_DIRECCION;
    }

    public void setC_DIRECCION(String c_DIRECCION) {
        C_DIRECCION = c_DIRECCION;
    }

    public String getC_TELEFONO_PERSONAL() {
        return C_TELEFONO_PERSONAL;
    }

    public void setC_TELEFONO_PERSONAL(String c_TELEFONO_PERSONAL) {
        C_TELEFONO_PERSONAL = c_TELEFONO_PERSONAL;
    }

    public String getC_EMPRESA() {
        return C_EMPRESA;
    }

    public void setC_EMPRESA(String c_EMPRESA) {
        C_EMPRESA = c_EMPRESA;
    }

    public String getC_TELEFONO_EMPRESA() {
        return C_TELEFONO_EMPRESA;
    }

    public void setC_TELEFONO_EMPRESA(String c_TELEFONO_EMPRESA) {
        C_TELEFONO_EMPRESA = c_TELEFONO_EMPRESA;
    }

    public double getI_INGRESOS_MENSUALES() {
        return I_INGRESOS_MENSUALES;
    }

    public void setI_INGRESOS_MENSUALES(double i_INGRESOS_MENSUALES) {
        I_INGRESOS_MENSUALES = i_INGRESOS_MENSUALES;
    }

    public int getI_PERSONAS_A_CARGO() {
        return I_PERSONAS_A_CARGO;
    }

    public void setI_PERSONAS_A_CARGO(int i_PERSONAS_A_CARGO) {
        I_PERSONAS_A_CARGO = i_PERSONAS_A_CARGO;
    }

    public String getC_DESPLAZADO() {
        return C_DESPLAZADO;
    }

    public void setC_DESPLAZADO(String c_DESPLAZADO) {
        C_DESPLAZADO = c_DESPLAZADO;
    }

    public String getC_OCUPACION() {
        return C_OCUPACION;
    }

    public void setC_OCUPACION(String c_OCUPACION) {
        C_OCUPACION = c_OCUPACION;
    }

    public String getC_TRABAJA() {
        return C_TRABAJA;
    }

    public void setC_TRABAJA(String c_TRABAJA) {
        C_TRABAJA = c_TRABAJA;
    }

    public String getC_PER_RED_UNIDOS() {
        return C_PER_RED_UNIDOS;
    }

    public void setC_PER_RED_UNIDOS(String c_PER_RED_UNIDOS) {
        C_PER_RED_UNIDOS = c_PER_RED_UNIDOS;
    }

    public int getC_ESTRATO() {
        return C_ESTRATO;
    }

    public void setC_ESTRATO(int c_ESTRATO) {
        C_ESTRATO = c_ESTRATO;
    }

    public int getC_SISBEN() {
        return C_SISBEN;
    }

    public void setC_SISBEN(int c_SISBEN) {
        C_SISBEN = c_SISBEN;
    }

    public int getNIVEL_ESTUDIOS() {
        return NIVEL_ESTUDIOS;
    }

    public void setNIVEL_ESTUDIOS(int NIVEL_ESTUDIOS) {
        this.NIVEL_ESTUDIOS = NIVEL_ESTUDIOS;
    }
}
