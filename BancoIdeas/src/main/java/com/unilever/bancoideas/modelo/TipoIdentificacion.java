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
@Table(name = "tipo_identificacion", schema = "public")
public class TipoIdentificacion implements java.io.Serializable {
    @NotNull
    private Integer tiidId;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String codigo;
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
    private String nombre;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String usuCreador;
    private String usuModificador;
    private Set<Persona> personas = new HashSet<Persona>(0);

    public TipoIdentificacion() {
    }

    public TipoIdentificacion(Integer tiidId, String codigo,
        String estadoRegistro, Date fechaCreacion, Date fechaModificacion,
        String nombre, Set<Persona> personas, String usuCreador,
        String usuModificador) {
        this.tiidId = tiidId;
        this.codigo = codigo;
        this.estadoRegistro = estadoRegistro;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.nombre = nombre;
        this.usuCreador = usuCreador;
        this.usuModificador = usuModificador;
        this.personas = personas;
    }

    @Id
    @Column(name = "tiid_id", unique = true, nullable = false)
    public Integer getTiidId() {
        return this.tiidId;
    }

    public void setTiidId(Integer tiidId) {
        this.tiidId = tiidId;
    }

    @Column(name = "codigo", nullable = false)
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    @Column(name = "nombre", nullable = false)
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "usu_creador", nullable = false)
    public String getUsuCreador() {
        return this.usuCreador;
    }

    public void setUsuCreador(String usuCreador) {
        this.usuCreador = usuCreador;
    }

    @Column(name = "usu_modificador")
    public String getUsuModificador() {
        return this.usuModificador;
    }

    public void setUsuModificador(String usuModificador) {
        this.usuModificador = usuModificador;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoIdentificacion")
    public Set<Persona> getPersonas() {
        return this.personas;
    }

    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
    }
}
