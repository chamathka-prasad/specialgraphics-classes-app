package uk.specialgraphics.api.payload.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserLoginResponse {
    private String token;

    private String fname;

    private String lname;

    private String email;

    private String gup_type;

}
