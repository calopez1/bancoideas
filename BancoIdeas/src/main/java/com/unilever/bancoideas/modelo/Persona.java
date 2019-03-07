package com.unilever.bancoideas.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
@Entity
@Table(name = "persona", schema = "public")
public class Persona implements java.io.Serializable {
    @NotNull
    private Integer persId;
    @NotNull
    private TipoIdentificacion tipoIdentificacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String email;
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
    private String identificacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String primerApellido;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String primerNombre;
    private String segundoApellido;
    private String segundoNombre;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String usuCreador;
    private String usuModifica;
    private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Persona() {
    }

    public Persona(Integer persId, String email, String estadoRegistro,
        Date fechaCreacion, Date fechaModificacion, String identificacion,
        String primerApellido, String primerNombre, String segundoApellido,
        String segundoNombre, TipoIdentificacion tipoIdentificacion,
        String usuCreador, String usuModifica, Set<Usuario> usuarios) {
        this.persId = persId;
        this.tipoIdentificacion = tipoIdentificacion;
        this.email = email;
        this.estadoRegistro = estadoRegistro;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.identificacion = identificacion;
        this.primerApellido = primerApellido;
        this.primerNombre = primerNombre;
        this.segundoApellido = segundoApellido;
        this.segundoNombre = segundoNombre;
        this.usuCreador = usuCreador;
        this.usuModifica = usuModifica;
        this.usuarios = usuarios;
    }

    @Id
    @Column(name = "pers_id", unique = true, nullable = false)
    public Integer getPersId() {
        return this.persId;
    }

    public void setPersId(Integer persId) {
        this.persId = persId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tiid_id")
    public TipoIdentificacion getTipoIdentificacion() {
        return this.tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Column(name = "identificacion", nullable = false)
    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Column(name = "primer_apellido", nullable = false)
    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Column(name = "primer_nombre", nullable = false)
    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Column(name = "segundo_apellido")
    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Column(name = "segundo_nombre")
    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
