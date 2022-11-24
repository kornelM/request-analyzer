package pl.request.analyzer.recipient;

@Getter
@RequiredArgsConstructor
public enum PolishTemplateType {

    NORMAL_TEMPLATE("0"),
    US_TEMPLATE("2"),
    FOREIGN_TEMPLATE("3"),
    TOPUP_TEMPLATE("4");

    private final String value;
}
