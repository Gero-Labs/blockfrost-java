package io.blockfrost.sdk.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * TxContentUtxoInputs
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)

public class TransactionUtxoInputs {
    private String address;
    private List<TransactionOutputAmount> amount = new ArrayList<TransactionOutputAmount>();
    private String txHash;
    private BigDecimal outputIndex;

    /** Hash of the output's datum, when it carries one. */
    private String dataHash;

    /** CBOR-encoded inline datum (CIP-32). */
    private String inlineDatum;

    /** Hash of the reference script attached to the output (CIP-33). */
    private String referenceScriptHash;

    /** True when this input is collateral, consumed only on phase-2 validation failure. */
    private Boolean collateral;

    /** True when this input is a reference input (CIP-31) — read, not spent. */
    private Boolean reference;

}

