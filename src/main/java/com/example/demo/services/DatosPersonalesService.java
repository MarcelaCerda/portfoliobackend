
package com.example.demo.services;
import java.util.ArrayList;
import com.example.demo.models.DatosPersonalesModel;
import com.example.demo.repositories.DatosPersonalesRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DatosPersonalesService {
    @Autowired
    DatosPersonalesRepository datospersonalesRepository;
    public ArrayList<DatosPersonalesModel> obtenerDatosPersonales(){
        return (ArrayList<DatosPersonalesModel>) datospersonalesRepository.findAll();
    //findAll metodo de CrudRepository
   }
    public DatosPersonalesModel guardarDatosPersonales(DatosPersonalesModel datospersonales){
        return datospersonalesRepository.save(datospersonales);  //save metodo de CrudRepository
    }//**************** 2da etapa
    public Optional<DatosPersonalesModel> obtenerPorId(Long id){
        return datospersonalesRepository.findById(id);
    }
    /*public ArrayList<DatosPersonalesModel>  obtenerPorPrioridad(Integer prioridad) {
        return datospersonalesRepository.findByPrioridad(prioridad);
    }*/
    public boolean eliminarDatosPersonales(Long id) {
        try{
            datospersonalesRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}

