package ma.atos.reclamation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class B2BDTO extends ClientDTO {

    private String registreCommerce;
    private String patente;
    private String fax;
    private String raisonSocial;
}
