package rastak.train.ws.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rastak.train.ws.model.enums.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "SignUp")
public class SignUp {
    @Schema(description = "User username", example = "Alirez")
    private String username;
    @Schema(description = "User password", example = "12@alireza#21")
    private String password;
    @Schema(description = "User fullname", example = "Alireza Ahmadi")
    private String fullname;
    @Schema(description = "User role", example = "ADMIN")
    private Role role;
}
