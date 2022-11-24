package pl.request.analyzer.recipient.request;

import pl.request.analyzer.recipient.LoopRowId;

public class BaseListingRequestDto {

    @NotNull
            Min(1)
        Max(1000)
    Integer quantity;
    LoopRowId loopRowId;

    Min(1)
    Max(1000)
    Integer pageNumber;

    @NotNull
    ListingAction action;
}
