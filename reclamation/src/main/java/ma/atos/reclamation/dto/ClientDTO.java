package ma.atos.reclamation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.atos.reclamation.enums.TypeClient;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ClientDTO {

    private String reference;
    private String adresse;
    private TypeClient type;
    private List<FactureDTO> factureDTOList;


}
