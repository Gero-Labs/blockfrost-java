package io.blockfrost.sdk.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * TxContentUtxoOutputs
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)

public class TransactionUtxoOutputs {
    private String address;
    private List<TransactionOutputAmount> amount = new ArrayList<TransactionOutputAmount>();

    /**
     * The output's index in its transaction.
     *
     * <p>Without this an output cannot be referenced at all: a consumer has the
     * address and the value but no way to name the UTxO it describes.
     */
    private BigDecimal outputIndex;

    /** Hash of the output's datum, when it carries one. */
    private String dataHash;

    /** CBOR-encoded inline datum (CIP-32). */
    private String inlineDatum;

    /** Hash of the reference script attached to the output (CIP-33). */
    private String referenceScriptHash;

    /** True when this output is a collateral return. */
    private Boolean collateral;

    /** Hash of the transaction that consumed this output, or null while unspent. */
    private String consumedByTx;

}

