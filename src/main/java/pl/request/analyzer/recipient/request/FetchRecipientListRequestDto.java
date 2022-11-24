package pl.request.analyzer.recipient.request;

import pl.request.analyzer.recipient.BaseListingResponseDto;
import pl.request.analyzer.recipient.PolishTransactionType;

import java.util.Set;

public class FetchRecipientListRequestDto extends BaseListingRequestDto {

    String text;

    String customerId
    String trusteeId
    String customerKind
    String customerRelation
    Set<String> customerRelation;
    Set<CardWithAccounts> cards;
    Set<PolishTransactionType> transactionTypes;
    Set<FrontRecipientType> recipientTypes
            Boolean offlineMode
}
