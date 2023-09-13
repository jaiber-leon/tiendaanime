package com.example.tiendaanime.mapper;

import com.example.tiendaanime.dto.TipoProductoDTO;
import com.example.tiendaanime.models.TipoProductoModel;
import org.springframework.stereotype.Service;

@Service
public class TipoProductoMapper {
    public TipoProductoDTO convertirModelADTO (TipoProductoModel tipoProductoModel){
        return new TipoProductoDTO().builder()
                .idTipoproducto(tipoProductoModel.getIdTipoproducto())
                .tipo(tipoProductoModel.getTipo())
                .descripcion(tipoProductoModel.getDescripcion())
                .build();
    }
    public TipoProductoModel convertirDTOaModel (TipoProductoDTO tipoProductoDTO){
        TipoProductoModel tipoProductoModel = new TipoProductoModel();
        tipoProductoModel.setIdTipoproducto(tipoProductoDTO.getIdTipoproducto());
        tipoProductoModel.setTipo(tipoProductoDTO.getTipo());
        tipoProductoModel.setDescripcion(tipoProductoDTO.getDescripcion());
        return tipoProductoModel;
    }
}
