package com.consultorios.consultorios.controller;

import com.consultorios.consultorios.dto.Mensaje;
import com.consultorios.consultorios.dto.consultanteDto;
import com.consultorios.consultorios.entity.consultante;
import com.consultorios.consultorios.service.consultanteServ;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.beans.XMLEncoder;
import java.util.List;

@RestController
@RequestMapping("/consultante")
@CrossOrigin
public class consultanteControll
{
    @Autowired
    consultanteServ consultanteServ;


    /**
     * Procedimiento para listar los registros de la base de datos.
     * @return
     */
    @GetMapping("/lista")
    public ResponseEntity<List<consultante>> list()
    {
        List<consultante> list = consultanteServ.list();
        return new ResponseEntity(list, HttpStatus.OK);

    }

    /**
     * Procedimiento para obtener un registro mediante un ID.
     * @param id
     * @return
     */
    @GetMapping("/detail/{id}")
    public ResponseEntity<consultante> getByID(@PathVariable("id") int id)
    {
        if(!consultanteServ.existsByID(id))
        {
            return new ResponseEntity(new Mensaje("No se econtró"), HttpStatus.NOT_FOUND);

        }
        consultante newconsul = consultanteServ.getOne(id).get();
        return new ResponseEntity<consultante>(newconsul, HttpStatus.OK);
    }

    /**
     * Procedimiento para crear un nuevo registro en la base de datos.
     * @param consultanteDto
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody consultanteDto consultanteDto)
    {
        if(consultanteServ.existsByID(consultanteDto.getI_DOC_IDENTIFICACION()))
            return new ResponseEntity(new Mensaje("Ya existe un usuario con el ID "), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(consultanteDto.getC_NOMBRES()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        consultante consulnuevo = new consultante(
                        consultanteDto.getI_DOC_IDENTIFICACION(),
                        consultanteDto.getC_NOMBRES(),
                        consultanteDto.getC_APELLIDOS(),
                        consultanteDto.getC_GENERO(),
                        consultanteDto.getI_TIPO_DOC(),
                        consultanteDto.getI_LUGAR_EXPEDICION(),
                        consultanteDto.getI_EDAD(),
                        consultanteDto.getI_ID_CONSULTANTE(),
                        consultanteDto.getC_ESTADO_CIVIL(),
                        consultanteDto.getC_TIPO_VIVIENDA(),
                        consultanteDto.getC_DIRECCION(),
                        consultanteDto.getC_TELEFONO_PERSONAL(),
                        consultanteDto.getC_EMPRESA(),
                        consultanteDto.getC_TELEFONO_EMPRESA(),
                        consultanteDto.getI_INGRESOS_MENSUALES(),
                        consultanteDto.getI_PERSONAS_A_CARGO(),
                        consultanteDto.getC_DESPLAZADO(),
                        consultanteDto.getC_OCUPACION(),
                        consultanteDto.getC_TRABAJA(),
                        consultanteDto.getC_PER_RED_UNIDOS(),
                        consultanteDto.getC_ESTRATO(),
                        consultanteDto.getC_SISBEN(),
                        consultanteDto.getNIVEL_ESTUDIOS());

        consultanteServ.saveOne(consulnuevo);

        return new ResponseEntity(new Mensaje("Consultante creado"), HttpStatus.OK);
    }

    /**
     * Procedimiento para eliminar un registro de la base de datos.
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id)
    {
        if(!consultanteServ.existsByID(id))
            return new ResponseEntity(new Mensaje("No existe el consultante"), HttpStatus.NOT_FOUND);
        consultanteServ.deleteOne(id);
        return new ResponseEntity(new Mensaje("Consultante eliminado"), HttpStatus.OK);
    }

    /**
     * Procedimiento para actualizar los datos de un consultante.
     * @param id
     * @param consultanteDto
     * @return
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody consultanteDto consultanteDto)
    {
        if(!consultanteServ.existsByID(id))
            return new ResponseEntity(new Mensaje("No existe el ID buscado"), HttpStatus.NOT_FOUND);
        consultante consul = consultanteServ.getOne(id).get();

        consul.setC_NOMBRES(consultanteDto.getC_NOMBRES());

        /**
        consul.setC_APELLIDOS(consultanteDto.getC_APELLIDOS());
        consul.setC_DESPLAZADO(consultanteDto.getC_DESPLAZADO());
        consul.setC_DIRECCION(consultanteDto.getC_DIRECCION());
        consul.setC_EMPRESA(consultanteDto.getC_EMPRESA());
        consul.setC_ESTRATO(consultanteDto.getC_ESTRATO());
        consul.setC_GENERO(consultanteDto.getC_GENERO());
        consul.setI_ID_CONSULTANTE(consultanteDto.getI_ID_CONSULTANTE());
        consul.setC_DESPLAZADO(consultanteDto.getC_DESPLAZADO());
        consul.setC_ESTADO_CIVIL(consultanteDto.getC_ESTADO_CIVIL());
        consul.setC_OCUPACION(consultanteDto.getC_OCUPACION());
        consul.setC_SISBEN(consultanteDto.getC_SISBEN());
        consul.setI_INGRESOS_MENSUALES(consultanteDto.getI_INGRESOS_MENSUALES());
        consul.setNIVEL_ESTUDIOS(consultanteDto.getNIVEL_ESTUDIOS());
        consul.setI_PERSONAS_A_CARGO(consultanteDto.getI_PERSONAS_A_CARGO());
        consul.setI_LUGAR_EXPEDICION(consultanteDto.getI_LUGAR_EXPEDICION());
        consul.setC_TRABAJA(consultanteDto.getC_TRABAJA());
        consul.setC_TELEFONO_PERSONAL(consultanteDto.getC_TELEFONO_PERSONAL());
        consul.setC_TELEFONO_EMPRESA(consultanteDto.getC_TELEFONO_EMPRESA());
        **/
        consultanteServ.saveOne(consul);
        return new ResponseEntity(new Mensaje("Consultante actualizado"), HttpStatus.OK);
    }

}
