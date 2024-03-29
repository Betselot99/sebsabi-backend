package et.com.gebeya.safaricom.coreservice.dto.requestDto;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GigWorkerSearchRequestDto {

    private String firstName;
    private String lastName;
    private String qualification;
    private String email;


        public GigWorkerSearchRequestDto(Map<String, String> requestParams) {
            this.firstName = requestParams.getOrDefault("firstName", "");
            this.lastName = requestParams.getOrDefault("lastName", "");
            this.qualification = requestParams.getOrDefault("qualification", "");
            this.email = requestParams.getOrDefault("email", "");
        }
}