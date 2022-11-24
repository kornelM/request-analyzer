package pl.request.analyzer.recipient;

import jdk.jfr.DataAmount;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountNumber {

    @JsonIgnore
    Optional<IbanAccountNumber> ibanAccountNumber;
    @JsonIgnore
    AccountNumberType type;
    @JsonIgnore
    String originalAccountNumber;
}
