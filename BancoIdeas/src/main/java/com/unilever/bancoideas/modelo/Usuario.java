package com.unilever.bancoideas.modelo;

import java.util.Date;

import javax.persistence.*;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
@Entity
@Table(name = "usuario", schema = "public")
public class Usuario implements java.io.Serializable {
    @NotNull
    private Integer usuaId;
    @NotNull
    private Departamento departamento;
    @NotNull
    private Persona persona;
    @NotNull
    private TipoUsuario tipoUsuario;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String contrasena;
    @NotNull
    @NotEmpty
    @Size(max = 1)
    private String estadoRegistro;
    @NotNull
    private Date fechaCreacion;
    private Date fechaModificacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String usuCreador;
    private String usuModifica;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String usuario;

    public Usuario() {
    }

    public Usuario(Integer usuaId, String contrasena,
        Departamento departamento, String estadoRegistro, Date fechaCreacion,
        Date fechaModificacion, Persona persona, TipoUsuario tipoUsuario,
        String usuCreador, String usuModifica, String usuario) {
        this.usuaId = usuaId;
        this.departamento = departamento;
        this.persona = persona;
        this.tipoUsuario = tipoUsuario;
        this.contrasena = contrasena;
        this.estadoRegistro = estadoRegistro;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuCreador = usuCreador;
        this.usuModifica = usuModifica;
        this.usuario = usuario;
    }

    @Id
    @Column(name = "usua_id", unique = true, nullable = false)
    public Integer getUsuaId() {
        return this.usuaId;
    }

    public void setUsuaId(Integer usuaId) {
        this.usuaId = usuaId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "depa_id")
    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pers_id")
    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tius_id")
    public TipoUsuario getTipoUsuario() {
        return this.tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Column(name = "contrasena", nullable = false)
    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Column(name = "estado_registro", nullable = false)
    public String getEstadoRegistro() {
        return this.estadoRegistro;
    }

    public void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    @Column(name = "fecha_creacion", nullable = false)
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Column(name = "fecha_modificacion")
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Column(name = "usu_creador", nullable = false)
    public String getUsuCreador() {
        return this.usuCreador;
    }

    public void setUsuCreador(String usuCreador) {
        this.usuCreador = usuCreador;
    }

    @Column(name = "usu_modifica")
    public String getUsuModifica() {
        return this.usuModifica;
    }

    public void setUsuModifica(String usuModifica) {
        this.usuModifica = usuModifica;
    }

    @Column(name = "usuario", nullable = false)
    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
