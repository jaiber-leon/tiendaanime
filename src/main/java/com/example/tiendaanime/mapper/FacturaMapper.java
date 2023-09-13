package com.example.tiendaanime.mapper;

import com.example.tiendaanime.dto.FacturaDTO;
import com.example.tiendaanime.dto.ProductoDto;
import com.example.tiendaanime.models.FacturaModel;
import com.example.tiendaanime.models.ProductoModel;
import org.springframework.stereotype.Service;

@Service
public class FacturaMapper {

    public FacturaDTO transformarModelADTO (FacturaModel facturaModel){
         return FacturaDTO.builder()
                 .idFactura(facturaModel.getIdFactura())
                 .fecha(facturaModel.getFecha())
                 .build();
    }
    public  FacturaModel transformarDTOaModel (FacturaDTO facturaDTO){
        FacturaModel facturaModel = new FacturaModel();
        facturaModel.setIdFactura(facturaDTO.getIdFactura());
        facturaModel.setFecha(facturaDTO.getFecha());
        return facturaModel;
    }
}
