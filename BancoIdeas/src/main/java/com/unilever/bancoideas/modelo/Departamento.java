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
@Table(name = "departamento", schema = "public")
public class Departamento implements java.io.Serializable {
    @NotNull
    private Integer depaId;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String codigo;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String descripcion;
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
    private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Departamento() {
    }

    public Departamento(Integer depaId, String codigo, String descripcion,
        String estadoRegistro, Date fechaCreacion, Date fechaModificacion,
        String nombre, String usuCreador, String usuModificador,
        Set<Usuario> usuarios) {
        this.depaId = depaId;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estadoRegistro = estadoRegistro;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.nombre = nombre;
        this.usuCreador = usuCreador;
        this.usuModificador = usuModificador;
        this.usuarios = usuarios;
    }

    @Id
    @Column(name = "depa_id", unique = true, nullable = false)
    public Integer getDepaId() {
        return this.depaId;
    }

    public void setDepaId(Integer depaId) {
        this.depaId = depaId;
    }

    @Column(name = "codigo", nullable = false)
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Column(name = "descripcion", nullable = false)
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "departamento")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
