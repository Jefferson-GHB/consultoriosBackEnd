package com.consultorios.consultorios.service;

import com.consultorios.consultorios.entity.consultante;
import com.consultorios.consultorios.repository.consultanteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class consultanteServ
{
    @Autowired
    consultanteRepo prodRepo;

    /**
     * Lista todos los registros de la base de datos.
     * @return
     */
    public List<consultante> list ()
    {
        return prodRepo.findAll();
    }

    /**
     * Consulta un registro desde la base de datos.
     * @param id
     * @return
     */
    public Optional <consultante> getOne (int id)
    {
        return prodRepo.findById(id);
    }

    /**
     * Comprueba la existencia de un registro en la base de datos.
     * @param id
     * @return
     */
    public boolean existsByID(int id)
    {
        return prodRepo.existsById(id);
    }

    /**
     * Elimina un registro buscado.
     * @param id
     */
    public void deleteOne(int id)
    {
        prodRepo.deleteById(id);
    }

    /**
     * Guarda un registro nuevo en la base de datos.
     * @param consultant
     */
    public void  saveOne(consultante consultant)
    {
        prodRepo.save(consultant);
    }


}
